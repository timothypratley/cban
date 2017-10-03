(ns cban.core
  (:require
    [clojure.string :as string]
    [clojure.edn :as edn]
    [clojure.java.io :as io]))

(defn read-translation-map [s]
  (-> s
      (io/resource)
      (slurp)
      (edn/read-string)))

(defn read-translation-maps [ss]
  (apply merge-with merge
         (map read-translation-map ss)))

(defn macro? [{:keys [macro special-form]}]
  (or macro special-form))

;; TODO: this (not quite) duplicates lein-cban function...
;; could have lein-cban as a dep... but is there a better way?
(defn destination-ns [language source-ns]
  ;; TODO: can we use dots?
  (str "cban."
       (string/replace source-ns "." "-")
       "-"
       language))

(defn generate-refer-clauses [translation-map]
  (for [[language namespaces] translation-map
        [source-ns translations] namespaces]
    ;; TODO: Warnings?
    (let [valid (for [[existing translation] translations
                      :when (and existing (:alias translation))]
                  translation)
          non-macros (->> valid
                          (remove macro?)
                          (map :alias))
          macros (->> valid
                      (filter macro?)
                      (map :alias))]
      (str
        "'[" (destination-ns language source-ns)
        (when (seq non-macros)
          (str " :refer [" (string/join " " non-macros) "]"))
        (when (seq macros)
          (str " :refer-macros [" (string/join " " macros) "]"))
        "]"))))

(defn generate-require-statement [translation-map]
  (str
    "(require "
    (string/join " " (generate-refer-clauses translation-map))
    ")"))

(defn generate-cljs-refer-clauses [translation-map remove-macros?]
  (for [[language namespaces] translation-map
        [source-ns translations] namespaces
        :let [valid (for [[existing translation] translations
                          :when (and existing (:alias translation))
                          :when (not (#{"true" "false"} existing))]
                      translation)]
        :when (seq valid)]
    (str
     "[" source-ns
     (str " :refer [" (string/join " " (map :existing valid)) "]")
     (str " :rename " (into {}
                            (for [{:keys [existing alias]} valid]
                              [(symbol existing) (symbol alias)])))
     "]")))

(defn generate-user-namespace [translation-map cljs?]
  (str
    "(ns " (if cljs? "cljs.user" "clj.user")
    "\n;; This file was generated, do not modify it directly\n"
    "  (:require\n    "
    (string/join "\n    "
      (generate-cljs-refer-clauses translation-map cljs?))
    "))\n"))

