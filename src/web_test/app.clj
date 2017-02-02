(ns web-test.app
  (:require [copse.core :refer [bootstrap]])
  (:use [copse.route])
  (:gen-class :main true))

(load "http/routes")

(def app-namespace (-> *ns*
                       (str)
                       (symbol)))

(defn -main []
  (bootstrap app-namespace))
