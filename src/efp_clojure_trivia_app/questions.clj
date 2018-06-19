(ns efp-clojure-trivia-app.questions
  (:require [cheshire.core :refer [parse-string]]
            [clojure.java.io :as io]))

(defn load-questions
  "Loads questions from resources/questions.json"
  []
  (-> (io/resource "questions.json")
                   (slurp)
                   (parse-string true)))

(def questions (atom (load-questions)))

(defn random-question []
  (rand-nth @questions))