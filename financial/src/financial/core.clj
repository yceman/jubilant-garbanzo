(ns financial.core
  (:gen-class))

(defn create-transactions
  [name amount]
  {:name name :amount amount})

(def transactions
    [
        (create-transactions "sell" 12.99)
        (create-transactions "buy" -100.)
        (create-transactions "sell" 123.45)
        (create-transactions "buy" -1.99)
        ;{:name "sell" :amount 12.99}
        ;{:name "buy" :amount -100.}
        ;{:name "sell" :amount 123.45}
        ;{:name "buy" :amount -1.99}
    ])

(defn get-amounts-a
  [transactions-real]
  (map :amount transactions-real))

(defn get-amounts-b
  [transactions-real]
  (map (fn [x] (:amount x)) transactions-real))

(defn get-amounts-c
  [transactions-real]
  (map #(:amount %) transactions-real))

(defn total-amounts
  [transactions-real]
  (reduce +(get-amounts-a transactions-real)))

(defn this-a-sell?
  [transactions-real]
  (= "sell" (:name transactions-real)))

(defn get-sells
  [transactions-real]
  (filter this-a-sell? transactions-real))

(defn this-a-buy?
  [transactions-real]
  (= "buy" (:name transactions-real)))

(defn get-buys
  [transactions-real]
  (filter this-a-buy? transactions-real))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
