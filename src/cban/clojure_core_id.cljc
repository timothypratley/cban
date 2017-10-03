(ns cban.clojure-core-id)

;; This file was generated, do not modify it directly

#?(:clj (defmacro amendapatkan
  [& body]
  `(aget ~@body)))

#?(:clj (defmacro dan
  [& body]
  `(and ~@body)))

(defn menerapkan
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

#?(:clj (defmacro amengatur
  [& body]
  `(aset ~@body)))

(defn rekan
  ([map key val]
   (assoc map key val))
  ([map key val & kvs]
   (apply assoc map key val kvs)))

#?(:clj (defmacro menetapkan
  [& body]
  `(def ~@body)))

#?(:clj (defmacro dfungsi
  [& body]
  `(defn ~@body)))

#?(:clj (defmacro fungsi
  [& body]
  `(fn ~@body)))

#?(:clj (defmacro jika
  [& body]
  `(if ~@body)))

#?(:clj (defmacro membiarkan
  [& body]
  `(let ~@body)))

(defn berkali-kali
  ([f]
   (repeatedly f))
  ([n f]
   (repeatedly n f)))
