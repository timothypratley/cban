(ns cban.clojure-core-ko)

;; This file was generated, do not modify it directly

(defmacro 함수를정의
  [& body]
  `(defn ~@body))

(defmacro 배열을얻을
  "fun , "
  [& body]
  `(aget ~@body))

(defmacro 기능
  [& body]
  `(fn ~@body))

(def 대다
  clojure.core/apply)

(defmacro 만약
  [& body]
  `(if ~@body))

(defmacro 방해
  [& body]
  `(let ~@body))

(defmacro 과
  [& body]
  `(clojure.core/and ~@body))

(defmacro 세트
  [& body]
  `(aset ~@body))

(defmacro 밝히다
  [& body]
  `(def ~@body))

(def 자꾸
  clojure.core/repeatedly)

(def 에연결
  clojure.core/assoc-in)

(def 동무
  clojure.core/assoc)
