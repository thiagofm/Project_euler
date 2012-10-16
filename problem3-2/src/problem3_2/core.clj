(ns problem3-2.core)

(defn is-prime? "checks if arg is prime" [n]
  (loop [max-i (inc (int (Math/sqrt n)))
         i 2]
    (if (not= max-i i)
      (if (= (mod n i) 0)
        false
        (recur max-i (inc i))
      )
      true
    )
  )
)

(defn largest-prime-factor [n]
  (loop [largest 2
         n-actual n
         i 2]
    (if (= (mod n-actual i) 0)
      (if (< largest i)
        (recur i (/ n-actual i) 2)
        (recur largest (/ n-actual i) 2))
      (if (not= n-actual 1)
        (recur largest n-actual (inc i))
        largest
      )
    )
  )
)

(defn -main "doc-string" [& args]
  (largest-prime-factor 600851475143)
)
