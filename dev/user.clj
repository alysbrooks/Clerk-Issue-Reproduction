(ns user
  (:require [nextjournal.clerk :as clerk]))

(comment
  ;; start without file watcher & open browser
  (clerk/serve! {:browse? true})

  ;; start without file watcher
  (clerk/serve! {})
  
  ;; start with file watcher
  (clerk/serve! {:watch-paths ["notebooks" "official-notebooks"]})

  ;; start with file watcher and show filter function to enable notebook pinning
  (clerk/serve! {:watch-paths ["notebooks" "src"] :show-filter-fn #(clojure.string/starts-with? % "notebooks")})

  (clerk/show! "official-notebooks/readme.clj")

  (clerk/show! "notebooks/2022_06_12_probability.clj")

  (clerk/show! "notebooks/onwards.md")
  (clerk/show! "notebooks/rule_30.clj")
  (clerk/show! "official-notebooks/how_clerk_works.clj")
  (clerk/show! "notebooks/pagination.clj")
  (clerk/show! "notebooks/paren_soup.clj")
  (clerk/show! "notebooks/recursive.clj")
  (clerk/show! "notebooks/tap.clj")

  (clerk/show! "official-notebooks/markdown.md")

  (clerk/show! "notebooks/viewer_api.clj")


  (clerk/show! "notebooks/viewers/vega.clj")
  (clerk/show! "notebooks/viewers/plotly.clj")
  (clerk/show! "notebooks/viewers/table.clj")
  (clerk/show! "notebooks/viewers/tex.clj")
  (clerk/show! "notebooks/viewers/markdown.clj")
  (clerk/show! "official-notebooks/viewers/html.clj")

  (clerk/show! "notebooks/sicmutils.clj")

  (clerk/clear-cache!)
  )
