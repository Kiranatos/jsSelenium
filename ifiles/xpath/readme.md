https://www.w3.org/TR/1999/REC-xpath-19991116/
https://www.w3schools.com/xml/xpath_syntax.asp

Examples:
//button[@id='submit']
//div[not(@style='display:none')]/a
    2 шага
    not - отрицание; выбираем все div-ы кроме тех, что style='display:none'
//*[text()='the visible text'and@class='class1']
    любой элемент (*) dom-a, вызывается ф-ция xpath (text()), которая ищет элементы с текстом 'the visible text' и классом 'class1'
//li[contains(@value,'choice1')]
//span[count(div)>=3]
//*[@class='search-result']/descendant-or-self::*[@id='banana']
    2 шага: сначала выбираются элементы по 'search-result', потом внутри их элементы по 'banana'
    descendant-or-self - наследники или сам искомый элемент
//a[ends-with(@href,'.pdf')]