(defproject parens-of-the-dead "0.1.0-SNAPSHOT"
  :description "A simple zombie game"
  :url "http://www.parens-of-the-dead.com"
  :dependencies [[org.clojure/clojure "1.7.0"]
				 [org.clojure/clojurescript "1.7.228"]
				 [http-kit "2.1.18"]
				 [com.stuartsierra/component "0.3.1"]
				 [compojure "1.5.0"]]


  :main undead.system

  :profiles {:dev {:plugins [[lein-cljsbuild "1.1.3"]
							 [lein-figwheel "0.5.0"]]
				   :dependencies [[reloaded.repl "0.2.1"]]
				   :source-paths ["dev"]
				   :cljsbuild {:builds [{:source-paths ["src" "dev"]
										 :compiler {:output-to "target/classes/public/app.js"
													:figwheel true
													:output-dir "target/classes/public/out"
													:optimizations :none
													:recompile-dependents true
													:source-map true}}]}}})
