(defproject om-tut "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2156"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [om "0.5.0"]
                 [ring "1.2.1"]
                 [compojure "1.1.6"]
                 [enlive "1.1.5"]]

  :plugins [[lein-cljsbuild "1.0.2"]]

  :source-paths ["src" "dev"]

  :profiles {:dev {:plugins [[com.cemerick/austin "0.1.3"]
                             [lein-cljsbuild "1.0.1"]]
                   :cljsbuild {:builds [{:id "om-tut"
                                         :source-paths ["src" "dev"]
                                         :compiler {:output-to "target/classes/public/om_tut.js"
                                                    ;;:output-dir "target/classes/public/out"
                                                    :optimizations :whitespace
                                                    ;:source-map true
                                                    }}]}}})
