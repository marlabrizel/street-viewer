(ns street-viewer.core
  (:require [reagent.core :as reagent]))

(enable-console-print!)

(defonce app-state (reagent/atom {:text "Hello world!"}))

(defn map-view
  []
  [:div.map-view
   [:div
     (@app-state :text)]])

(defn on-js-reload []
  (swap! app-state update-in [:__figwheel_counter] inc))
