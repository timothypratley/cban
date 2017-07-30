(ns cban.es.csv)

;; This file was generated, do not modify it directly

(def toma take)

(def baja drop)

(def carga inc)

(def extracto dec)

(def gama range)

(def toma-mientras take-while)

(def baja-mientras drop-while)

(def mapa map)

(def hachís-mapa hash-map)

(def enumera list)

(def pone set)

(def hachís-pone hash-set)

(def átomo atom)

(def agencia agent)

(def primero first)

(def segundo second)

(def último last)

(def pero-último butlast)

(def lodemás rest)

(def próximo next)

(def cierto true)

(def falso false)

(def imprime print)

(def imprimeln println)

(def forma filter)

(def quita remove)

(def guardar keep)

(def ventosa slurp)

(def escupe spit)

(def sec seq)

(def hazcorrer dorun)

(def haztodo doall)

(def crd str)

(def interpone interpose)

(def encuentra find)

(def consigue get)

(def aplica apply)

(def cuenta count)

(def cada? every?)

(def cierto? true?)

(def falso? false?)

(def social concat)

(def identidad identity)

(def invierte reverse)

(def alguno some)

(def aplana flatten)

(def booleano boolean)

(def si if)

(defmacro cuando [& body]
  `(when ~@body))

(defmacro si-no [& body]
  `(if-not ~@body))

(defmacro cuando-no [& body]
  `(when-not ~@body))

(defmacro deja [& body]
  `(let ~@body))

(defmacro y [& body]
  `(and ~@body))

(defmacro o [& body]
  `(or ~@body))

(def no not)

(def más else)

(defmacro darvuelta [& body]
  `(loop ~@body))

(defmacro hazsec [& body]
  `(doseq ~@body))

(defmacro para [& body]
  `(for ~@body))

(defmacro dependela [& body]
  `(cond ~@body))

(def haz do)
