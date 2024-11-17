(ns re-frame.router-test
  (:require
    [clojure.test :refer :all]
    [re-frame.core :as rf]))

(defn fixture-re-frame
  [f]
  (let [restore-re-frame (re-frame.core/make-restore-fn)]
    (f)
    (restore-re-frame)))

(use-fixtures :each fixture-re-frame)

(rf/reg-event-db
  ::minimal
  (fn [db _]
    db))

(deftest dispatching-race-condition-469-test
  (is (nil? (rf/dispatch [::minimal]))))
