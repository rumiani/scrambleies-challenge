(ns app.components.scramble.inputcheck_function
  (:require
   [goog.string :as gstring]))

(defn inputcheck_function [string]
  (= (re-find #"[a-z]+" string) (gstring/trim string)))

