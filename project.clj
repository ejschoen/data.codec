(defproject org.clojure/data.codec "0.1.1-SNAPSHOT"
  :description "Clojure codec implementations."
  :url "https://github.com/clojure/data.codec"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :dependencies [[org.clojure/clojure "1.3.0"]]
  :aliases {"perf" ["with-profile" "perf" "run"]}
  :profiles {:test {:dependencies [[commons-codec "1.5"]]}
             :perf {:dependencies [[commons-codec "1.5"]
                                   [criterium "0.4.3"]]
                    :source-paths ["src/perf/clojure"]
                    :main clojure.data.codec.perf-base64}})