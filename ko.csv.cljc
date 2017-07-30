(ns power-turtle.lang.m)

;; This file was generated, do not modify it directly

(def 배열을얻을 aget)

(defmacro 과 [& body]
  `(and ~@body))

(def 대다 apply)

(def 세트 aset)

(def 동무 assoc)

(def 에연결 assoc-in)

(def 밝히다 def)

(defmacro 함수를정의 [& body]
  `(defn ~@body))

(def 만약 if)

(defmacro 기능 [& body]
  `(fn ~@body))

(def 자꾸 repeatedly)

(defmacro 방해 [& body]
  `(let ~@body))
