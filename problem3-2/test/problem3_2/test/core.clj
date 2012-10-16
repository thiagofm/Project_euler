(ns problem3-2.test.core
  (:use [problem3-2.core])
  (:use [clojure.test]))

(deftest is-prime-test
    (is (= (is-prime 7) true)))
