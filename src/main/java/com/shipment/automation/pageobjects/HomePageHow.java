package com.shipment.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePageHow extends PageObject {
    public By scroll = By.xpath("//*[text()='Indicates required field']");
    public  By continueButton = By.xpath("//button[text()='Continue']");
}
