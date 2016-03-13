(ns undead.web
  (:require [compojure
             [core :refer [defroutes GET]]
             [route :refer [resources]]]))

(defn index [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "<h1>HELLO FROM COMPOJURE!!!</h1>"})

(defroutes app
  (GET / [] index)
  (resources /))
