(ns firsty-friday.views.vote
  (:use hiccup.core
        hiccup.page
        hiccup.form)
  (require [clojure.string :as string]
           [firsty-friday.models.restaurants :as restaurant-model]))

(defn- restaurant-voting [restaurant]
  (html [:h3 (:name restaurant)]
        (submit-button "Vote")))

(defn restaurants-voting [restaurants]
  (string/join (map restaurant-voting
            restaurants)))

(defn index []
  (html5 [:h1 "Firsty Friday Voting"]
         (restaurants-voting restaurant-model/all)))
