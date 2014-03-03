(ns firsty-friday.db
  (require [clojurewerkz.neocons.rest :as nr]))

(defn start []
  (nr/connect! "http://localhost:7474/db/data/"))
