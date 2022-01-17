(ns server.core
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.reload :refer [wrap-reload]]
            [compojure.core :refer [defroutes GET ANY]]
            [compojure.route :refer [not-found]]
            [ring.handler.dump :refer [handle-dump]]
            [server.handler :refer [ scramble-handler ] ]
            [server.view :refer [ not-found-component main-page-component] ]
            [clojure.string :as s]
            )
  (:gen-class))

(defroutes app
  (GET "/request" [] handle-dump)
  (ANY "/"  [] (main-page-component))
  (GET "/scramble/:str1/:str2" [] scramble-handler)
  (not-found (not-found-component)))

(defn -main [& args]
  (let [port (Integer/parseInt (s/trim (first args)))]
    (jetty/run-jetty app {:port port})))
(defn -dev-main [& args]
  (let [port (Integer/parseInt (s/trim (first args)))]
    (jetty/run-jetty (wrap-reload #'app) {:port port})))















(defn -dev-main [port]
  (jetty/run-jetty (wrap-reload #'app) {:port (Integer. port)}))
