(ns clojure.examples.tests
	(:gen-class))

;; 
(defn sum-two-elements [element1 element2]
    (println  (str (+ element1 element2))))
(sum-two-elements 1 3)

;; print ten integer random elements
(println (take 10 (repeatedly (fn [] (int (rand 100))))))
