(defproject efp-clojure-trivia-app "0.1.0"
  :description "EFP exercise 57"
  :url "https://pragprog.com/book/bhwb/exercises-for-programmers"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [cli4clj "1.4.0"]
                 [cheshire "5.8.0"]]
  :main ^:skip-aot efp-clojure-trivia-app.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
