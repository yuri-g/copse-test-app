(in-ns 'web-test.app)

(app-routes
 (GET "/" (fn [] {:status 200 :body "Hello World!"}))
 (GET "/auth" (fn [] {:status 200 :body "Auth will go here"})))
