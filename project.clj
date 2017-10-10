(defproject cban "0.1.0"
  :description "Translations for clojure.core"
  :url "http://github.com/timothypratley/cban"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :plugins [[lein-cban "0.1.0"]]
  :cban {:input-dir "translations"
         :output-dir "src"
         :output-map-to "resources/clojure-core-translations-map.edn"})
