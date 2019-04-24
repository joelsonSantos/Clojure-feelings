(ns clojure.examples.tests
	(:gen-class))

;;
(defn sum-two-elements [element1 element2]
    (println  (str (+ element1 element2))))
(sum-two-elements 1 3)

(def elements (take 10000000 (repeatedly (fn [] (int (rand 10000000))))))
;; compute timestamp of reduce primitive math operation
(def timestp (time (reduce + elements)))
