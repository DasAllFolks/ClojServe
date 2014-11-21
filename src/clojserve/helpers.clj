(ns clojserve.core
  (:gen-class))

(defn tokenize-string
  "Separates a string into a list of string tokens given a separator character"
  [separator string]
  ; XXXX: Write me!
  nil )

(defn process-request-line
  "Separates out parameters for the HTTP request line"
  [request-line]
  ; XXXX: Combine parameters which are just characters right now.
  ; XXXX: And then what to do with all of these parameters?
  ([] nil)
  (filter #(not (or (= % \space) (= % \return) (= % \newline))) request-line))
