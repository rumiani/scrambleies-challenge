(ns app.components.scramble.inputcheck-function
  (:require 
      [goog.string :as gstring]
))

(defn inputcheck-function [string]
   (= (re-find #"[a-z]+" string) (gstring/trim string)))

