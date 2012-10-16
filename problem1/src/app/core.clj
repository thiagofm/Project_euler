(ns app.core)

(defn -main
  [& args]
  (reduce + (filter (fn [n] (if (or (= (mod n 3) 0) (= (mod n 5) 0)) true false)) (range 1000)))
)
