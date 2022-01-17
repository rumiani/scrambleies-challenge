(defn scramble?
  [str1 str2]
  (every? (fn [[l f]] (<= f (get (frequencies str1) l 0))) (frequencies str2))
)