(ns cljs-plask.core)


(def plask (js/require "plask"))

(def the-window
  (.simpleWindow
   plask
   #js {
         :init (fn []
                 (this-as this
                          (let [canvas (.-canvas this)
                                paint (.-paint this)]
                            (.setFill paint)
                            (.setAntiAlias paint true)
                            (.setColor paint 80 0 0 255))))
         :draw (fn []
                 (this-as this
                          (let [canvas (.-canvas this)
                                paint (.-paint this)]
                            (.clear canvas 230 230 230 255)
                            (.drawCircle canvas paint 200 150 100)
                            (.drawCircle canvas paint 230 230 230 255))
                          ))}))



(comment
  (let [http (js/require "http")
       handler (fn [req res] (.end res "Hello sailor!"))
       server (.createServer http handler)]
   (.listen server 1337)))


(comment

  (this-as this
           (let [canvas (.-canvas this)
                 paint (.-paint this)]
             (.clear canvas 230 230 230 255)
             (.drawCircle canvas paint 300 200 50))
           )

  (defn foo
    "I don't do a whole lot."
    [x]
    (println x "Hello, World!"))
  )






