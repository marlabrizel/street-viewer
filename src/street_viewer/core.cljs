(ns street-viewer.core
  (:require [reagent.core :as reagent]))

(enable-console-print!)

(defonce app-state (reagent/atom {:street "" :city ""}))

(defn map-view
  []
  [:div.map-view
   [:p "Street: "]
   [:p "City: "]
   [:img {:src "http://cdn.earthporm.com/wp-content/uploads/2015/10/proud-mommies-2__605.jpg"}]])

(reagent/render-component [map-view]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  (swap! app-state update-in [:__figwheel_counter] inc))
