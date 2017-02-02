(in-ns 'web-test.app)

(route
 (GET "/" "test")
 (GET "/auth" "Auth test"))

(defn test-test []
  (println "This function should be called by Router"))

