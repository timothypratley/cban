(ns cban.core-test
  (:require [clojure.test :refer :all]
            [cban.core :as cban]))

(deftest produces-a-refer
  (is (re-find
        #"\(require '\[clojure.core :refer \[.+\] :refer\-macros \[.+\]\]\).*?"
        (cban/refer-from-translation-map "cban-translations-map.edn"))))
