###Tasks docs

**# Get in touch: [Contact Me](https://mail.google.com/mail/u/0/?fs=1&tf=cm&source=mailto&to=maziar.rumiani@gmail.com)
**

### TASK 1

```
Complete the function (scramble str1 str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false

Notes:
Only lower case letters will be used (a-z). No punctuation or digits will be included.
Performance needs to be considered

Examples:
(scramble? “rekqodlw” ”world”) ==> true
(scramble? “cedewaraaossoqqyt” ”codewars”) ==> true
(scramble? “katas”  “steak”) ==> false
Solution:
```

**Note: solution can be tested in [scramblies-function](https://github.com/rumiani/clojure-challenge/blob/main/scramblies-function.clj)**

**Comments:**

It was a little bit challenging at first but after doing some mistakes and reviewing my cheatsheat I figoured it out.
I think it was less challenging than other tasks although I love to practice writing algorithems with Clojure more.


### TASK 2
Create a web service that accepts two strings in a request and applies function scramble? from previous task to them.
Link to the source code: 

**Comments:**
I have watched some tutorials to learn some backend and do this task, I used Ring, compojure, Hiccup and some other libraries and tools for this web service.I would like to learn more about Backend in Flexiana.

**What I could do more:**
I could add more componnents for handling diffrent errors.
I could use a query instead of passing the strings to the URL.
I could do some string varifications for the backend.
I could write more tests.

### TASK 3
Create a UI in ClojureScript with two inputs for strings and a scramble button. When the button is fired it should call the API from previous task and display a result.
Note: solution can be found in /frontend

**Comments:**
I also have watched some tutorials about using Reagent and Shadow cljs and also some other libraries and tools and also used DOM a lot which made me feel quit comfortable with ClojureScript.
I should say the fact that the frontend part is so similar to React and I also can use JavaScript tips and trics in ClojureScript was a relife for me and I could easily handle the front although I spent more time compare to the backend but I'd say it was easier because I already knew a lot of stuff.
I also used plain CSS for the UI because honestly although I know TailwindCSS but I wanted to learn diffrent usages and types of writing CSS in ClojureScript and I think I'm quit comfortable now and I can do it with Tailwind since now. 

**What I could do more:**
I could use TailwindCSS.
I could build a better UI
The state could be only one r/atom map.
I could write more tests.



**# This is also the: [QUESTIONNAIRE](https://docs.google.com/document/d/1Kx60G7FgEDHnDJFR0yGk_MkvNSeLgh5z1fmADHEY4lM/edit?usp=sharing_eil_m&ts=61e3ee9b)
**