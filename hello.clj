;(def x 7)
;(println "The result is"(def))
;; Equivalent to: (fn [x] (+ 6 x))
#(+ 6 %)

;; Equivalent to: (fn [x y] (+ x y))
#(+ %1 %2)

;; Equivalent to: (fn [x y & zs] (println x y zs))
#(println %1 %2 %&)
(defn greet [name] (str "Hello," name))
(println "The name is"(greet "students"))

(println "The Source is"(+ 3 4))
;(println "The Source is"(+ 10 *1))
(defn messenger-builder [greeting]
  (fn [who] (println greeting who))) ; closes over greeting
(def hello-er (messenger-builder "hello"))
(println (hello-er "world!"))