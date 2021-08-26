package com.shipment.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePageDetails extends PageObject {
    public By descriptionProductInput = By.id("nbsShipmentDescription");
    public By scroll = By.xpath("//*[text()='Indicates required field']");
    public  By continueButton = By.xpath("//button[text()='Continue']");

}
