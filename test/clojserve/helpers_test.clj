(ns clojserve.helpers-test
  (:require [clojure.test :refer :all]
            [clojserve.helpers :refer :all]))

(deftest valid-request-type
  (testing "Valid request type"
    (is (= true (is-valid-request-type "get")))))

(deftest invalid-request-type
  (testing "Invalid request type"
    (is (= false (is-valid-request-type "bogus")))))
