(ns clojserve.core-test
  (:require [clojure.test :refer :all]
            [clojserve.core :refer :all]))

(deftest fail-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(deftest success-test
  (testing "Whereas I work."
    (is (= 1 1))))
