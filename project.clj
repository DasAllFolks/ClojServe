(defproject clojserve "0.1.0-SNAPSHOT"
  :description "This is intended as a learning project for both Clojure and the fundamentals of web servers; the goal is to write a Clojure program which accepts nearly any type of HTTP request and returns the appropriate HTTP response.  NOT intended for production use."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clj-http "1.0.1"]]
  :main ^:skip-aot clojserve.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
