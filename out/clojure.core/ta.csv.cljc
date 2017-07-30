(ns cban.ta.csv)

;; This file was generated, do not modify it directly

(def எடு take)

(def விடு drop)

(def ஏற்று inc)

(def இறக்கு dec)

(def வீச்சு range)

(def எடு-என்னும்வரை take-while)

(def விடு-என்னும்வரை drop-while)

(def பின்னு interleave)

(def இறுக்கு reduce)

(def விவரி map)

(def புலவெண்-விவரணையாக்கம் hash-map)

(def பட்டியல் list)

(def அமைவு set)

(def புலவெண்-அமைவு hash-set)

(def அணு atom)

(def முதல் first)

(def இரண்டாம் second)

(def கடைசி last)

(def கடைசியின்றி butlast)

(def மீதி rest)

(def அடுத்த next)

(def வாய்மை true)

(def பொய்மை false)

(def அச்சிடு print)

(def வரி-அச்சிடு println)

(def வடி filter)

(def அகற்று remove)

(def கொள் keep)

(def வரிசை seq)

(def செய்யோட்டம் dorun)

(def செய்யெல்லாம் doall)

(def தொடை str)

(def இடைபொருத்து interpose)

(def கண்டுபிடி find)

(def பெறு get)

(def செயல்படுத்து apply)

(def எண்ணு count)

(def ஒவ்வொன்றுமா? every?)

(def உண்மையா? true?)

(def பொய்மையா? false?)

(def தொடு concat)

(def அடையாளம் identity)

(def புரட்டு reverse)

(def எதாவது some)

(def தட்டையாக்கு flatten)

(def பூலியன்}} boolean)

(def எனில் if)

(defmacro என்னும்போது [& body]
  `(when ~@body))

(defmacro இல்லெனில் [& body]
  `(if-not ~@body))

(defmacro இல்லென்னும்-போது [& body]
  `(when-not ~@body))

(def வரையறு def)

(defmacro செயல்கூறு [& body]
  `(fn ~@body))

(defmacro வரையறு-செயல்கூறு [& body]
  `(defn ~@body))

(defmacro வைத்துக்கொள் [& body]
  `(let ~@body))

(defmacro மற்றும் [& body]
  `(and ~@body))

(defmacro அல்லது [& body]
  `(or ~@body))

(def அன்று not)

(defmacro சுற்று [& body]
  `(loop ~@body))

(defmacro செய்வரிசை [& body]
  `(doseq ~@body))

(defmacro ஒன்றொன்றுக்கு [& body]
  `(for ~@body))

(defmacro பொறுத்து [& body]
  `(cond ~@body))

(def செய் do)
