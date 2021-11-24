package net.kiranatos;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
import org.openqa.selenium.*;

public class Demo01HelloChrome {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\IDE\\WebDrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://myanimelist.net");
        Thread.sleep(2000);

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./wfiles/chromeScr.png"));
        driver.quit();
    }
}