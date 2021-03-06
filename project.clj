(defproject Howler "1.0.0-SNAPSHOT"
  :description "logging to SQS"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [fnparse "2.2.7"]
                 [com.google.code.typica/typica "1.7.2"]
                 [clj-growl "0.2.1" :exclusions [org.clojure/clojure-contrib
                                                 org.clojure/clojure]]]
  :dev-dependencies [[swank-clojure "1.2.1"]]
  :main Howler.core)
