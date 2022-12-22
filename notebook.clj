;; # Template for creating notebooks using Clerk

(ns notebook.template
  (:require [nextjournal.clerk :as clerk]))

(comment

  ;; Start Clerk server
  (clerk/serve! {:watch-paths ["."] :browse? true})
  (clerk/show! "notebook.clj")

  :end)
