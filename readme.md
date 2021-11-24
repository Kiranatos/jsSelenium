Summary of Selenium Web Driver

https://www.selenium.dev/documentation/en/webdriver/browser_manipulation/
https://github.com/SeleniumHQ
https://github.com/bonigarcia/webdrivermanager

подготовка для selenium-проекта:
- в системных переменных прописать PATH к D:\Java\IDE\WebDrivers\, где лежат chromedriver.exe, geckodriver.exe, msedgedriver.exe
- dependency in pom.xml
- в коде регистрировать через System.setProperty

Chrome (chromedriver.exe): 
F12 - develeoper tool

Firefox (geckodriver.exe):
https://www.softwaretestinghelp.com/geckodriver-selenium-tutorial/
https://selenium-python.com/install-geckodriver
https://github.com/mozilla/geckodriver/releases/

Internet Explorer:
WebDriver driver = new EdgeDriver();
System.setProperty("webdriver.edge.driver", "D:\\Java\\IDE\\WebDrivers\\msedgedriver.exe");
https://www.browserstack.com/guide/launch-edge-browser-in-selenium


проработать:
https://www.tutorialspoint.com/sendkeys-not-working-in-selenium-webdriver
https://www.lambdatest.com/blog/how-to-use-selenium-sendkeys/


из курса https://learn.epam.com - WebDriver
курс Epam - WebDriver Selenium (2018) сохранил в телеграмме
https://github.com/zviartouski
раздел Synchronization и Page Object не конспектировал.
нужно проанализировать и переписать код под себя:
https://github.com/zviartouski/webdriver-from-scratch
(webdriver-from-scratch/src/test/java/pageobject_model/)

