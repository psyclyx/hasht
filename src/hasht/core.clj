(ns hasht.core)

(defn t*
  [form]
  `(let [result# ~form]
     (tap> result#)
     result#))
