(ns cban.clojure-core-ko)

;; This file was generated, do not modify it directly

#?(:clj (defmacro 배열을얻을
  "fun , "
  [& body]
  `(aget ~@body)))

#?(:clj (defmacro 과
  [& body]
  `(and ~@body)))

(defn 대다
  ([f args]
   (apply f args))
  ([f x args]
   (apply f x args))
  ([f x y args]
   (apply f x y args))
  ([f x y z args]
   (apply f x y z args))
  ([f a b c d & args]
   (apply apply f a b c d args)))

#?(:clj (defmacro 세트
  [& body]
  `(aset ~@body)))

(defn 동무
  ([map key val]
   (assoc map key val))
  ([map key val & kvs]
   (apply assoc map key val kvs)))

#?(:clj (defmacro 밝히다
  [& body]
  `(def ~@body)))

#?(:clj (defmacro 함수를정의
  [& body]
  `(defn ~@body)))

#?(:clj (defmacro 기능
  [& body]
  `(fn ~@body)))

#?(:clj (defmacro 만약
  [& body]
  `(if ~@body)))

#?(:clj (defmacro 방해
  [& body]
  `(let ~@body)))

(defn 자꾸
  ([f]
   (repeatedly f))
  ([n f]
   (repeatedly n f)))
