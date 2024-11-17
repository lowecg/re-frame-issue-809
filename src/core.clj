(ns core
  (:require [re-frame.core :as rf])
  (:gen-class))

(rf/reg-event-db
  ::minimal
  (fn [db _]
    db))

(defn -main
  [& _args]
  (rf/dispatch [::minimal])
  (println "Dispatched minimal event"))
