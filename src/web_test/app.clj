(ns web-test.app
  (:use [copse.route])
  (:use [copse.core])
  (:gen-class :main true))

(def app (ns-name *ns*))

(load "http/routes")

(defn -main []
  (bootstrap app))
