package com.shipment.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePageWhat extends PageObject {
    public By weightInput = By.id("nbsPackagePackageWeightField0");
    public  By continueButton = By.xpath("//button[text()='Continue']");
}
