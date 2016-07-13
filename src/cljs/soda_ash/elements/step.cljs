(ns soda-ash.elements.step
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(defn create-group [m]
  (merge {:ui-name   "step"
          :only-one? true}
         m))


(def types
  [:default
   :link])


(def states
  [(create-group
    {:group-name   "states"
     :group-vector (vector
                    :active
                    :completed
                    :disabled)})
   ])


(def opts
  {:tag     :div
   :ui?     false
   :ui-name "step"
   :types types
   :states states})


(defcomp "default" opts)
(defcomp "link" (assoc opts :type :link :tag :a))
