(ns tetris.core
  (:require 
    [clojure.browser.repl :as repl]
    [tetris.Constants :as ct]))

;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))

(def canvas (-> js/document
              (.getElementById "board")))

(def ctx (-> canvas
           (.getContext "2d")))

(set! (.-width canvas) (* ct/COLS ct/BLOCK_SIZE))
(set! (.-height canvas) (* ct/ROWS ct/BLOCK_SIZE))

(-> ctx
    (.scale ct/BLOCK_SIZE ct/BLOCK_SIZE))



