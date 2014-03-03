(ns firsty-friday.models.restaurants
  (:require [clojurewerkz.neocons.rest.nodes :as node]
            [clojurewerkz.neocons.rest.relationships :as relationship]
            [clojurewerkz.neocons.rest.labels :as label]))

(defn all []
  (label/get-all-nodes "Restaurant"))

(defn create [name]
  (-> (node/create {:name name})
     (label/add "Restaurant")))
