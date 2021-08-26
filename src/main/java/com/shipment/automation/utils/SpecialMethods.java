package com.shipment.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

public class SpecialMethods {

    public static JavascriptExecutor executor;

    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickJS(WebDriver driver, By by) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(by));
    }


    public static void scroll(WebDriver driver, By by) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", new Object[]{driver.findElement(by)});
    }

    public static void write(WebDriver driver, By by, String string){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(by).sendKeys(string);
    }

    public static WebElement selectRandomOptionFromList(WebDriver driver, By by){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        List<WebElement> listElements = driver.findElements(by);
        int elementPosition = (int) (Math.random()*listElements.size());
        return listElements.get(elementPosition);
    }

    public static void validations(WebDriver driver, By by, String expectedString){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        assertEquals(driver.findElement(by).getText(),expectedString);
    }

    public static void visibleComponentValidation(WebDriver driver, By by){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        assertTrue(driver.findElement(by).isEnabled());
    }

}
