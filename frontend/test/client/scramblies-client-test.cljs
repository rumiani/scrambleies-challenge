(ns scramblies-client-test.cljs
  (:require [cljs.test :refer-macros [deftest is testing run-tests]]
            [app.components.scramble.inputcheck-function :refer [inputcheck-function]]
            [app.fetch_function.fetch_function :refer [fetch_function]]
            ))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest input-check-test
  (is (= inputcheck-function " sfsdfsdf "))
  (is (not (= inputcheck-function " sfsdfs df ")))
  (is (not (= inputcheck-function " Asfsdfsdf ")))
  (is (not (= inputcheck-function " sfsdfs df?")))
  )
(deftest fetch-test
  (is (= fetch_function " rumiani " " rumi"))
  (is (= fetch_function "world" " word"))
  (is (not (= fetch_function " clojurescript " " javascript")))
)

(deftest all-frontend-tests
  (input-check-test)
  (fetch-test))

(defn test-ns-hook []
  (all-frontend-tests))
