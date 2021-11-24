package net.kiranatos;

import java.io.File;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo03ChromeElements {    
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\IDE\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://myanimelist.net");
        Thread.sleep(3000);
        
        List<WebElement> listEl = driver.findElements(By.xpath("//*[@id=\"widget-seasonal-video\"]"));
        System.out.println("Size = " + listEl.size());
        listEl.get(0).click();
                
        Thread.sleep(3000);        
        driver.quit();
    }
}
/* List<WebElement> list = driver.findElements(By.xpath(""));
- returns all found elements
- collection can be empty, so no excetion in case of nothing is foun

WebElement e = driver.findElement(By.name(""));
- returns first found element
- not nullable, but exception in case of nothing found */