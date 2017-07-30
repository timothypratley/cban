(ns power-turtle.lang.m)

;; This file was generated, do not modify it directly

(def amendapatkan aget)

(defmacro dan [& body]
  `(and ~@body))

(def menerapkan apply)

(def amengatur aset)

(def rekan assoc)

(def rekan-di assoc-in)

(def menetapkan def)

(defmacro dfungsi [& body]
  `(defn ~@body))

(def jika if)

(defmacro fungsi [& body]
  `(fn ~@body))

(def berkali-kali repeatedly)

(defmacro membiarkan [& body]
  `(let ~@body))
