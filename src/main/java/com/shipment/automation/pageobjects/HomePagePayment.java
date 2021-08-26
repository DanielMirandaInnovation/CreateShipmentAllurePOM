package com.shipment.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePagePayment extends PageObject {
    public By scroll = By.xpath("//*[text()='Indicates required field']");
    public  By continueButton = By.xpath("//button[text()='Continue']");
    public By paypalOption = By.xpath("//span[text()=' PayPal ']");
    public By creditCardOption = By.xpath("//span[text()='Credit Card']");
    public By cardTypeSelect = By.id("cpcCardType");
    public By expirationMonthSelect = By.id("cpcCardExpirationMonth");
    public By expirationYearSelect = By.id("cpcCardExpirationYear");
    public By cardTypeList = By.xpath("//*[@id='cpcCardType']//option[@value='3: Object']");
    public By expirationMonthList =By.xpath("//*[@id='cpcCardExpirationMonth']//option[@value='3: 3']");
    public By expirationYearList = By.xpath("//*[@id='cpcCardExpirationYear']//option[@value='10: 2030']");
    public By cardNumberInput = By.id("cpcCardHolderCard");
    public By cvvInput = By.id("cpcCardCvv");
    public By reviewButton = By.id("nbsBackForwardNavigationReviewPrimaryButton");
}
