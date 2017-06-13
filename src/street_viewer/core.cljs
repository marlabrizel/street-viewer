(ns street-viewer.core
  (:require [reagent.core :as reagent]))

(enable-console-print!)

(defonce app-state (reagent/atom {:street "" :city ""}))

(def base-url
  "http://maps.googleapis.com/maps/api/streetview?size=600x400&location=")

(defn address-url
  [street city]
  (str street ", " city))

(def api-key
  (.get (js/URLSearchParams.
          js/document.location.search)
        "api-key"))
;; params = new URLSearchParams(document.location.search)
;; params.get("api-key")

(defn street-view-url
  "Takes a street and a city and returns a fully formed URL that can be used to
   make a call to the Google Street View API"
  [street city]
  (str base-url (address-url street city) "&key=" api-key))

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
