package net.kiranatos;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo02ChromeSearchAndClickBtn {    
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\IDE\\WebDrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://myanimelist.net");
        // check info ifiles\Demo02ChromeSearchAndClickBtn01.jpg, locator: //*[@id="topSearchText"]
        Thread.sleep(3000);
        
        loginInSite(driver);
        
        By searchBtnSelector = By.id("topSearchText");
        WebElement searchInput = driver.findElement(searchBtnSelector); // element input box for text  
        
        JavascriptExecutor jse = (JavascriptExecutor)driver;        
        jse.executeScript("arguments[0].value='Dorohedoro';", searchInput);

        searchInput.sendKeys("Dorohedoro"); // work in video, but not work on myanimelist site
        
        searchBtnSelector = By.id("topSearchButon");
//        searchBtnSelector = By.xpath("//*[@type='submit']"); // locator: //*[@type="submit"]
        WebElement searchButton = driver.findElement(searchBtnSelector); // element button "search"
        searchButton.click();
                
        Thread.sleep(3000);        
        driver.quit();
    }
    
    public static void loginInSite(WebDriver driver) throws InterruptedException {                
        WebElement we = driver.findElement(By.id("malLogin"));
        we.click();
        
        we = driver.findElement(By.id("loginUserName"));
        we.sendKeys("MyLogin");
        
        we = driver.findElement(By.id("login-password"));
        we.sendKeys("MyPassword");  
    }
}
