(ns clojserve.helpers
  (:gen-class))
(require '[clojure.string :as string])

(def request-type?
  ; XXXX: Write unit tests
  ; XXXX: Make sure we've covered all appropriate HTTP methods
  "Checks if input uppercase string corresponds to an HTTP request type"
  (set '("GET" "POST" "PUT" "HEAD" "TRACE" "OPTIONS" "DELETE" "CONNECT" "PATCH")))

(defn is-valid-request-type
  "Returns true for valid request types, false otherwise (case-insensitive)"
  [request-type]
  ; XXXX: Write unit tests
  (not (= nil (request-type? (string/upper-case request-type)))))

(defn process-request-line
  "Separates out parameters for the HTTP request line"
  [request-line]
  ; XXXX: Combine parameters which are just characters right now.
  ; XXXX: And then what to do with all of these parameters?
  ([] nil)
  (filter #(not (or (= % \space) (= % \return) (= % \newline))) request-line))
