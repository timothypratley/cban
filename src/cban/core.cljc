(ns cban.core
  (:require [clojure.string :as string]
            [clojure.edn :as edn]
            [clojure.java.io :as io]))

(defn macro? [{:keys [macro special-form]}]
  (or macro special-form))

;; TODO: this (not quite) duplicates lein-cban function...
;; could have lein-cban as a dep... but is there a better way?
(defn destination-ns [language source-ns]
  ;; TODO: can we not use dashes?
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

(defn generate-require-statement []
  (str
    "(require "
    (string/join " " (generate-refer-clauses translations))
    ")"))

(defn read-translation-map [s]
  (-> s
      (io/resource)
      (slurp)
      (edn/read-string)))

(defn read-translation-maps [ss]
  (apply merge-with merge
         (map read-translation-map ss)))
