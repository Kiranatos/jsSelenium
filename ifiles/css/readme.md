В отличие от XPATH, в CSS по осям иэрархии можно двигаться только вглубь(т.е. от родителя к наследникам). А в XPATH можно и наоборот.

https://drafts.csswg.org/selectors-3/
https://www.w3schools.com/cssref/css_selectors.asp
CSS Selector Tester: https://www.w3schools.com/cssref/trysel.asp

Examples:
h1
div.tagline
li#intro a
div.result > a
li ~ ul
a[href$=".pdf"]
span.alpha div#id > a:visited