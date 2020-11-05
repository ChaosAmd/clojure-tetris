(require
  '[cljs.build.api :as b]
  '[cljs.repl :as repl]
  '[cljs.repl.browser :as browser])

(b/build "src"
  {:main 'tetris.core
   :output-to "js/tetris.js"
   :output-dir "js"
   :verbose true})

(repl/repl (browser/repl-env)
  :output-dir "out")
