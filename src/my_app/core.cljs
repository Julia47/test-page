(ns my-app.core
  (:require [reagent.core :as r]))

(defn header []
  [:div
   [:h1 "** Nice to meet you **"]])

(defn mount-root []
  (js/console.log "Hello")
  (r/render [header] (.getElementById js/document "app")))

(defn ^:export init []
  (mount-root))

