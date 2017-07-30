(ns cban.core
  (:require
    [clojure.repl]
    [clojure.string :as string]
    [me.raynes.fs :as fs]
    [semantic-csv.core :as c]
    [clojure.java.io :as io]))

(def special-name
  #{"&" "fn" "catch" "try" "finally"})

(defn defs [ns-to-translate rows]
  (for [{:keys [existing alias docstring]} rows
        :when (and existing alias)
        :let [{:keys [special-form macro]} (meta (ns-resolve (symbol ns-to-translate) (symbol existing)))]]
    (if (or (special-name existing) special-form macro)
      (str "(defmacro " alias " [& body]\n  `(" existing " ~@body))")
      (str "(def " alias " " existing ")"))))

(defn generate [file ns-to-translate translations]
  (str "(ns cban." file ")\n\n;; This file was generated, do not modify it directly\n\n"
       (clojure.string/join "\n\n"
         (defs ns-to-translate translations))
       "\n"))

(defn -main [& args]
  (doseq [[root dirs files] (fs/iterate-dir "translations")
          :when (seq files)
          :let [ns-to-translate (fs/base-name root)]
          file files
          :let [translations (c/slurp-csv (io/file root file))]]
    (println "Writing" ns-to-translate files)
    (spit (io/file "out" ns-to-translate
                   (str file ".cljc"))
          (generate file ns-to-translate translations))))
