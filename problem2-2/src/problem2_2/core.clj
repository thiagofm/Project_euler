(ns problem2-2.core)

(defn fib "calculates fib for n"
  [fib-list total]
  (if
    (< (last fib-list) 4000000)
    (fib 
      [(last fib-list) (reduce + fib-list)]
      (if
        (even? (reduce + fib-list))
        (+ (reduce + fib-list) total)
        total
      )
    )
    total
  )
)

(defn -main "main" [& args]
  (fib [0 1] 0)
)
