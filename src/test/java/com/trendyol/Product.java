package com.trendyol;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Product extends Login{

    @Test
    public void UrunSearch() throws InterruptedException {
        WebElement kadin = driver.findElement(By.xpath("//div/a/span/img[@alt='Female']"));
        Thread.sleep(3000);
        kadin.click();
        WebElement search = driver.findElement(By.className("search-box"));
        search.click();
        search.sendKeys("Kazak" + Keys.ENTER);
        Thread.sleep(3000);
        WebElement empty = driver.findElement(By.cssSelector("div[id='container']"));
        empty.click();
        List<WebElement> kazak = driver.findElements(By.cssSelector("div[class='image-container']"));
        kazak.get(9).click();
        }
    }

