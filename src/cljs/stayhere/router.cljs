(ns stayhere.router
    (:require [reagent.session :as session]
              [secretary.core :as secretary :include-macros true]
              [stayhere.pages.home :refer [home-page]]
              [stayhere.pages.giver :refer [giver-page]]
              [stayhere.pages.charity :refer [charity-page]]
              [stayhere.pages.about :refer [about-page]])
    (:import goog.History))

(secretary/set-config! :prefix "#")

(secretary/defroute "/" []
  (session/put! :nav-state "home")
  (session/put! :current-page #'home-page))

(secretary/defroute "/giver" []
  (session/put! :nav-state "giver")
  (session/put! :current-page #'giver-page))

  (secretary/defroute "/charity" []
    (session/put! :nav-state "charity")
    (session/put! :current-page #'charity-page))

(secretary/defroute "/about" []
  (session/put! :nav-state "about")
  (session/put! :current-page #'about-page))
