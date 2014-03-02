(ns firsty-friday.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [firsty-friday.views.vote :as vote]))

(defroutes app-routes
  (GET "/" [] (vote/index))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (-> (routes app-routes)
     (handler/site)))
