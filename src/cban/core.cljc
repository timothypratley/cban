(ns cban.core
  (:require [clojure.string :as string]))

(defn macro? [{:keys [macro special-form]}]
  (or macro special-form))

(defn generate-refer [translation-map]
  (string/join
    "\n"
    (for [[language namespaces] translation-map
          [destination-ns translations] namespaces]
      ;; TODO: Warnings?
      (let [valid (for [{:keys [existing alias] :as t} translations
                        :when (and existing alias)]
                    t)
            non-macros (->> valid
                            (remove macro?)
                            (map :alias))
            macros (->> valid
                        (filter macro?)
                        (remove :alias))]
        (str
          "(require '[" destination-ns
          " :refer [" (string/join " " non-macros) "]"
          " :refer-macros [" (string/join " " macros) "]])\n")))))
