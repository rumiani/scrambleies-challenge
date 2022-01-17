(ns server.view
   (:require [hiccup.core :refer [html]]))



(defn main-page-component
  []
  (html [:div {:style "color:gren; margin:80px auto; width:250px; box-shadow:2px 2px 2px 2px #dceafa; padding:20px"}
         [:h3 {:style "color: green"} "Hi, this is the main page but nothing is here yet."]]))

(defn not-found-component
  []
  (html [:div {:style "color:red; margin:80px auto; width:250px; box-shadow:2px 2px 2px 2px #dceafa; padding:20px"}
         [:h3 {:style "color: red"} "Sorry! Page not found!"]]))