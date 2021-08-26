package com.shipment.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePageReview extends PageObject {
    public By termsAndConditionsCheckbox = By.id("termsAndConditionsCheckbox");
    public By payAndGetLabels = By.id("nbsBackForwardNavigationPayAndGetLabelsButton");
    public By scroll = By.xpath("//*[text()='Indicates required field']");
    public By paypalValidation = By.id("headerText");
    public By shipFromValidation = By.id("originDrawerCircleIndicator");
    public By shipToValidation = By.id("destinationDrawerCircleIndicator");
    public By packageInformationValidation = By.id("packageDrawerCircleIndicator");
    public By shippingServiceValidation = By.id("serviceDrawerCircleIndicator");
    public By additionalOptionValidation = By.id("additionalOptionsDrawerCircleIndicator");
    public By paymentValidation = By.id("paymentDrawerCircleIndicator");
}
