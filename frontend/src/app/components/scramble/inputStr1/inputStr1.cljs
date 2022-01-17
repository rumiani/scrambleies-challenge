(ns app.components.scramble.inputStr1.inputStr1
  (:require 
   [app.state :as  state]
   [goog.string :as gstring] 
   [app.components.scramble.inputcheck_function :refer [inputcheck_function]] 
   ))

(defn inputCheck 
  [input_string]
  (reset! state/fetch_data? false)
  (reset! state/fetch_error? false)
 (if (and (inputcheck_function input_string) 
          (not (= @state/first_input ""))) 
   (reset! state/first_input_valid? true)
   (reset! state/first_input_valid? false)
   )
  )

(defn inputStr1
  []
  [:div.input_div 
   [:input#first_input {:placeholder "Enter the first str" 
           :on-change (fn[e]  
                               (reset!  state/first_input  (gstring/trim (-> e .-target .-value)) ) 
                              (inputCheck (-> e .-target .-value))
                              )           
           }
   ]
   (when (= @state/first_input_valid? false) [:p.char_limit_error "Lowecase letters only (a-z)"])
   ])