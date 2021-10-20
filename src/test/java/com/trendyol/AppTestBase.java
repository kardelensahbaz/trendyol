package com.trendyol;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AppTestBase {
    WebDriver driver;
    WebDriverWait wait;
    @Before
    public void before(){
     System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
     ChromeOptions options = new ChromeOptions();
     options.addArguments("start-maximized");
     driver = new ChromeDriver(options);
     driver.get("https://www.trendyol.com/");
     wait = new WebDriverWait(driver, Duration.ofSeconds(30),Duration.ofMillis(05));
    }
  @After
    public void after(){
        driver.close();
        driver.quit();
    }
}
