package net.kiranatos;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo01HelloFirefox {
    public static void main(String[] args) throws InterruptedException, IOException {        
        System.setProperty("webdriver.gecko.driver","D:\\Java\\IDE\\WebDrivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://myanimelist.net");
        driver.manage().window().maximize();
        String appTitle = driver.getTitle();
        
        Thread.sleep(3000);
        driver.quit();
        //driver.close();
        
        System.out.println("TITLE: " + appTitle);
    }
}