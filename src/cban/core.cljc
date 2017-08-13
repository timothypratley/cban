(ns cban.core
  (:require [clojure.string :as string]
            [clojure.edn :as edn]
            [clojure.java.io :as io]))

(defn macro? [{:keys [macro special-form]}]
  (or macro special-form))

(defn generate-refer [translation-map]
  (string/join
    "\n"
    (for [[language namespaces] translation-map
          [destination-ns translations] namespaces]
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
          "(require '[" destination-ns
          " :refer [" (string/join " " non-macros) "]"
          " :refer-macros [" (string/join " " macros) "]])\n")))))

(defn refer-from-translation-map [s]
  (-> s
      (io/resource)
      (slurp)
      (edn/read-string)
      (generate-refer)))
