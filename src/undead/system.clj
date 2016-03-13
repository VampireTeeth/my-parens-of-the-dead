(ns undead.system
  (:require [com.stuartsierra.component :as component]
			[org.httpkit.server :refer [run-server]]
			[undead.web :refer [app]]))

(defn- start-server [handler port]
  (let [server (run-server handler {:port port})]
	(println "Server started on port" port)
	server))

(defn- stop-server [server]
  (server));;run-server returns a fn to stop the server

(defrecord ParensOfTheDead []
  component/Lifecycle
  (start [this]
	(assoc this :server (start-server #'app 9009)))
  (stop [this]
	(stop-server (:server this))
	(dissoc this :server)))

(defn create-system []
  (ParensOfTheDead.))

(defn -main [& args]
  (.start (create-system)))
