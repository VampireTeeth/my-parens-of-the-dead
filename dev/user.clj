(ns user
  (:require [reloaded.repl :refer [system init start stop go reset reset-all] :as repl]
			[undead.system :refer [create-system]]))

(repl/set-init! #'create-system)
