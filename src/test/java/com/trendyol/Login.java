package com.trendyol;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login extends AppTestBase {
   @Test
    public void signIn(){
       WebElement erkekClick = driver.findElement(By.xpath("//div/a/span/img[@alt='Male']"));
       erkekClick.click();
       wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".account-nav-item.user-login-container")));
       Actions actions = new Actions(driver);
       actions.moveToElement(driver.findElement(By.cssSelector(".account-nav-item.user-login-container"))).build().perform();
       driver.findElement(By.cssSelector(".login-button")).click();
       WebElement userName = driver.findElement(By.id("login-email"));
       userName.click();
       userName.sendKeys("");
       WebElement password = driver.findElement(By.id("login-password-input"));
       password.click();
       password.sendKeys("");
       WebElement button = driver.findElement(By.xpath("//button[@class='q-primary q-fluid q-button-medium q-button submit']"));
       button.click();


   }




}


