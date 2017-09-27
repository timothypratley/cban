(ns cban.core-test
  (:require
    [clojure.test :refer :all]
    [cban.core :as cban]))

(deftest produces-a-refer
  (let [translations (cban/read-translation-map "clojure-core-translations-map.edn")]
    (is (cban/generate-require-statement translations))
    (is (cban/generate-user-namespace translations))))
