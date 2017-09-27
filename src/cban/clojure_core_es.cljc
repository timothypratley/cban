(ns cban.clojure-core-es)

;; This file was generated, do not modify it directly

(defn agencia
  ""
  ([state options]
   (apply agent state options)))

(defmacro y
  [& body]
  `(and ~@body))

(defn aplica
  ([f args]
   (apply f args))
  ([f x args]
   (apply f x args))
  ([f x y args]
   (apply f x y args))
  ([f x y z args]
   (apply f x y z args))
  ([f a b c d args]
   (apply apply f a b c d args)))

(defn átomo
  ([x]
   (atom x))
  ([x options]
   (apply atom x options)))

(defn booleano
  ""
  ([x]
   (boolean x)))

(defn pero-último
  ""
  ([coll]
   (butlast coll)))

(defn social
  ([]
   (concat))
  ([x]
   (concat x))
  ([x y]
   (concat x y))
  ([x y zs]
   (apply concat x y zs)))

(defmacro dependela
  ""
  [& body]
  `(cond ~@body))

(defn cuenta
  ([coll]
   (count coll)))

(defn extracto
  ""
  ([x]
   (dec x)))

(defmacro haz
  [& body]
  `(do ~@body))

(defn haztodo
  ""
  ([coll]
   (doall coll))
  ([n coll]
   (doall n coll)))

(defn hazcorrer
  ""
  ([coll]
   (dorun coll))
  ([n coll]
   (dorun n coll)))

(defmacro hazsec
  [& body]
  `(doseq ~@body))

(defn baja
  ([n]
   (drop n))
  ([n coll]
   (drop n coll)))

(defn baja-mientras
  ([pred]
   (drop-while pred))
  ([pred coll]
   (drop-while pred coll)))

(defn cada?
  ([pred coll]
   (every? pred coll)))

(defmacro falso
  [& body]
  `(false ~@body))

(defn falso?
  ([x]
   (false? x)))

(defn forma
  ([pred]
   (filter pred))
  ([pred coll]
   (filter pred coll)))

(defn encuentra
  ([map key]
   (find map key)))

(defn primero
  ([coll]
   (first coll)))

(defn aplana
  ([x]
   (flatten x)))

(defmacro para
  ""
  [& body]
  `(for ~@body))

(defn consigue
  ([map key]
   (get map key))
  ([map key not-found]
   (get map key not-found)))

(defn hachís-mapa
  ([]
   (hash-map))
  ([keyvals]
   (apply hash-map keyvals)))

(defn hachís-pone
  ""
  ([]
   (hash-set))
  ([keys]
   (apply hash-set keys)))

(defn identidad
  ([x]
   (identity x)))

(defmacro si
  [& body]
  `(if ~@body))

(defmacro si-no
  [& body]
  `(if-not ~@body))

(defn carga
  ""
  ([x]
   (inc x)))

(defn interpone
  ([sep]
   (interpose sep))
  ([sep coll]
   (interpose sep coll)))

(defn guardar
  ([f]
   (keep f))
  ([f coll]
   (keep f coll)))

(defn último
  ([coll]
   (last coll)))

(defmacro deja
  [& body]
  `(let ~@body))

(defn enumera
  ([items]
   (apply list items)))

(defmacro darvuelta
  ""
  [& body]
  `(loop ~@body))

(defn mapa
  ([f]
   (map f))
  ([f coll]
   (map f coll))
  ([f c1 c2]
   (map f c1 c2))
  ([f c1 c2 c3]
   (map f c1 c2 c3))
  ([f c1 c2 c3 colls]
   (apply map f c1 c2 c3 colls)))

(defn próximo
  ""
  ([coll]
   (next coll)))

(defn no
  ([x]
   (not x)))

(defmacro o
  [& body]
  `(or ~@body))

(defn imprime
  ([more]
   (apply print more)))

(defn imprimeln
  ""
  ([more]
   (apply println more)))

(defn gama
  ([]
   (range))
  ([end]
   (range end))
  ([start end]
   (range start end))
  ([start end step]
   (range start end step)))

(defn quita
  ([pred]
   (remove pred))
  ([pred coll]
   (remove pred coll)))

(defn lodemás
  ""
  ([coll]
   (rest coll)))

(defn invierte
  ([coll]
   (reverse coll)))

(defn segundo
  ([x]
   (second x)))

(defn sec
  ""
  ([coll]
   (seq coll)))

(defn pone
  ([coll]
   (set coll)))

(defn ventosa
  ""
  ([f opts]
   (apply slurp f opts)))

(defn alguno
  ([pred coll]
   (some pred coll)))

(defn escupe
  ""
  ([f content options]
   (apply spit f content options)))

(defn crd
  ""
  ([]
   (str))
  ([x]
   (str x))
  ([x ys]
   (apply str x ys)))

(defn toma
  ([n]
   (take n))
  ([n coll]
   (take n coll)))

(defn toma-mientras
  ([pred]
   (take-while pred))
  ([pred coll]
   (take-while pred coll)))

(defmacro cierto
  [& body]
  `(true ~@body))

(defn cierto?
  ([x]
   (true? x)))

(defmacro cuando
  [& body]
  `(when ~@body))

(defmacro cuando-no
  [& body]
  `(when-not ~@body))
