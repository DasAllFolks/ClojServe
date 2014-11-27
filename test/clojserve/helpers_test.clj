(ns clojserve.core-test
  (:require [clojure.test :refer :all]
            [clojserve.core :refer :all]))

(deftest improperly-formatted-request
  (testing "Improperly formatted HTTP request"
    (is (= 500 (-main "complete rubbish" 1)))))
