(ns clojserve.core
  (:gen-class))
(require '[clojure.string :as string])

(def request-type?
  "Checks if input uppercase string corresponds to an HTTP request type"
  (set '("GET" "POST" "PUT" "HEAD" "TRACE" "OPTIONS" "DELETE" "CONNECT" "PATCH")))

(defn is-valid-request-type
  "Returns true for valid request types, false otherwise (case-insensitive)"
  [request-type]
  (not (= (nil (request-type? (string/capitalize request-type))))))

(defn process-request-line
  "Separates out parameters for the HTTP request line"
  [request-line]
  ; XXXX: Combine parameters which are just characters right now.
  ; XXXX: And then what to do with all of these parameters?
  ([] nil)
  (filter #(not (or (= % \space) (= % \return) (= % \newline))) request-line))
