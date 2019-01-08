(ns text-search-clj.core
  (:gen-class)
  (:use [clojure.string :as str]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn index
  "Builds an inverted index from a file."
  [file]
  ;(reduce conj {} )
  (str/split-lines (slurp file))) ; Split into paragraphs somehow...

(map print (index "src/text_search_clj/core.clj"))
