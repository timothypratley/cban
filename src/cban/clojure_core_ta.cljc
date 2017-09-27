(ns cban.clojure-core-ta)

;; This file was generated, do not modify it directly

(defmacro மற்றும்
  [& body]
  `(and ~@body))

(defn செயல்படுத்து
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

(defn அணு
  ([x]
   (atom x))
  ([x options]
   (apply atom x options)))

(defn பூலியன்
  ([x]
   (boolean x)))

(defn கடைசியின்றி
  ([coll]
   (butlast coll)))

(defn தொடு
  ([]
   (concat))
  ([x]
   (concat x))
  ([x y]
   (concat x y))
  ([x y zs]
   (apply concat x y zs)))

(defmacro பொறுத்து
  [& body]
  `(cond ~@body))

(defn எண்ணு
  ([coll]
   (count coll)))

(defn இறக்கு
  ([x]
   (dec x)))

(defmacro வரையறு
  [& body]
  `(def ~@body))

(defmacro வரையறு-செயல்கூறு
  [& body]
  `(defn ~@body))

(defmacro செய்
  [& body]
  `(do ~@body))

(defn செய்யெல்லாம்
  ([coll]
   (doall coll))
  ([n coll]
   (doall n coll)))

(defn செய்யோட்டம்
  ([coll]
   (dorun coll))
  ([n coll]
   (dorun n coll)))

(defmacro செய்வரிசை
  [& body]
  `(doseq ~@body))

(defn விடு
  ([n]
   (drop n))
  ([n coll]
   (drop n coll)))

(defn விடு-என்னும்வரை
  ([pred]
   (drop-while pred))
  ([pred coll]
   (drop-while pred coll)))

(defn ஒவ்வொன்றுமா?
  ([pred coll]
   (every? pred coll)))

(defmacro பொய்மை
  [& body]
  `(false ~@body))

(defn பொய்மையா?
  ([x]
   (false? x)))

(defn வடி
  ([pred]
   (filter pred))
  ([pred coll]
   (filter pred coll)))

(defn கண்டுபிடி
  ([map key]
   (find map key)))

(defn முதல்
  ([coll]
   (first coll)))

(defn தட்டையாக்கு
  ([x]
   (flatten x)))

(defmacro செயல்கூறு
  [& body]
  `(fn ~@body))

(defmacro ஒன்றொன்றுக்கு
  [& body]
  `(for ~@body))

(defn பெறு
  ([map key]
   (get map key))
  ([map key not-found]
   (get map key not-found)))

(defn புலவெண்-விவரணையாக்கம்
  ([]
   (hash-map))
  ([keyvals]
   (apply hash-map keyvals)))

(defn புலவெண்-அமைவு
  ([]
   (hash-set))
  ([keys]
   (apply hash-set keys)))

(defn அடையாளம்
  ([x]
   (identity x)))

(defmacro எனில்
  [& body]
  `(if ~@body))

(defmacro இல்லெனில்
  [& body]
  `(if-not ~@body))

(defn ஏற்று
  ([x]
   (inc x)))

(defn பின்னு
  ([]
   (interleave))
  ([c1]
   (interleave c1))
  ([c1 c2]
   (interleave c1 c2))
  ([c1 c2 colls]
   (apply interleave c1 c2 colls)))

(defn இடைபொருத்து
  ([sep]
   (interpose sep))
  ([sep coll]
   (interpose sep coll)))

(defn கொள்
  ([f]
   (keep f))
  ([f coll]
   (keep f coll)))

(defn கடைசி
  ([coll]
   (last coll)))

(defmacro வைத்துக்கொள்
  [& body]
  `(let ~@body))

(defn பட்டியல்
  ([items]
   (apply list items)))

(defmacro சுற்று
  [& body]
  `(loop ~@body))

(defn விவரி
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

(defn அடுத்த
  ([coll]
   (next coll)))

(defn அன்று
  ([x]
   (not x)))

(defmacro அல்லது
  [& body]
  `(or ~@body))

(defn அச்சிடு
  ([more]
   (apply print more)))

(defn வரி-அச்சிடு
  ([more]
   (apply println more)))

(defn வீச்சு
  ([]
   (range))
  ([end]
   (range end))
  ([start end]
   (range start end))
  ([start end step]
   (range start end step)))

(defn இறுக்கு
  ([f coll]
   (reduce f coll))
  ([f val coll]
   (reduce f val coll)))

(defn அகற்று
  ([pred]
   (remove pred))
  ([pred coll]
   (remove pred coll)))

(defn மீதி
  ([coll]
   (rest coll)))

(defn புரட்டு
  ([coll]
   (reverse coll)))

(defn இரண்டாம்
  ([x]
   (second x)))

(defn வரிசை
  ([coll]
   (seq coll)))

(defn அமைவு
  ([coll]
   (set coll)))

(defn எதாவது
  ([pred coll]
   (some pred coll)))

(defn தொடை
  ([]
   (str))
  ([x]
   (str x))
  ([x ys]
   (apply str x ys)))

(defn எடு
  ([n]
   (take n))
  ([n coll]
   (take n coll)))

(defn எடு-என்னும்வரை
  ([pred]
   (take-while pred))
  ([pred coll]
   (take-while pred coll)))

(defmacro வாய்மை
  [& body]
  `(true ~@body))

(defn உண்மையா?
  ([x]
   (true? x)))

(defmacro என்னும்போது
  [& body]
  `(when ~@body))

(defmacro இல்லென்னும்-போது
  [& body]
  `(when-not ~@body))
