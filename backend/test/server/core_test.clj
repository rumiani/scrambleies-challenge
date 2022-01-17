(ns server.core-test
  (:require [clojure.test :refer :all]
            [server.core :refer :all]
            [server.handler :refer [scramble?]])
  )

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest scramble?-check
  (is (scramble? "demmandss" "madness") "Scramble words: An example of 'true' result")
  (is (not (scramble? "mann" "maan")) "Scramble words: An example of 'false' result")
  )
(deftest scramble?-challenge-test
  (are [x y] (scramble? x y)
    "worldisgood" "word"
    "mynameismaziar" "mynameiszam"
    "javascript" "javscript") "Scramble words: Some random examples of 'true' result")

(deftest all-scramble?-tests
  (scramble?-check)
  (scramble?-challenge-test))

(defn test-ns-hook []
  (all-scramble?-tests))