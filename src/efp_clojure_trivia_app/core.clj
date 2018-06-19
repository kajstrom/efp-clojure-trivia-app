(ns efp-clojure-trivia-app.core
  (:require [efp-clojure-trivia-app.questions :refer [random-question]])
  (:gen-class))

(defn present-question []
  (let [question (random-question)]
    (println (:question question))
    (doseq [option (:answers question)]
      (println (:number option) "-" (:description option)))
    (println "Enter the number of your answer:")
    (let [answer (read-line)]
      (= (:correct question) (Integer/parseInt answer)))))

(defn -main
  [& args]
  (println "Welcome to the trivia app")
  (let [score (atom 0)]
    (while (present-question)
      (do
        (swap! score inc)
        (println "Correct! Current score is" @score)))
    (println "Incorrect! Game Over!")
    (println "Your score is:" @score)))
