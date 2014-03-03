(defproject firsty-friday "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.5"]
                 [clojurewerkz/neocons "2.0.1"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler firsty-friday.handler/app
         :init firsty-friday.db/start}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
