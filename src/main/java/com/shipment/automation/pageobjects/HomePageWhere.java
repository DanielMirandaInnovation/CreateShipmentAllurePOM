package com.shipment.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.ups.com/ship/guided/destination?tx=2168093475395478&loc=en_US")
public class HomePageWhere extends PageObject {


    public By countryOrTerritoryOrigenSelect = By.id("origin-cac_country");
    public static By nameOrigenInput = By.id("origin-cac_companyOrName");
    public static By contactNameOrigenInput = By.id("origin-cac_contactName");
    public static By addressOrigenInput = By.id("origin-cac_singleLineAddress");
    public static By addressOrigenInput1 = By.id("origin-cac_addressLine1");
    public By editAddressButton = By.id("origin-singleLineAddressEditButton");
    public By zipCodeOriginInput = By.id("origin-cac_postalCode");
    public By cityOrigenInput = By.id("origin-cac_city");
    public By stateOrigenSelect = By.id("origin-cac_state");
    public By floridaOptionList = By.xpath("//option[@value='FL']");
    public By alabamaOptionList = By.xpath("//option[@value='AL']");
    public By emailOrigenInput = By.id("origin-cac_email");
    public By phoneNumberOrigenInput = By.id("origin-cac_phone");
    public By extensionPhoneOrigenInput = By.id("origin-cac_extension");
    public  By continueButton = By.xpath("//button[text()='Continue']");
    public By nameDestinationInput = By.id("destination-cac_companyOrName");
    public By contactNameDestinationInput = By.id("destination-cac_contactName");
    public By editAddressDestinationButton = By.id("destination-singleLineAddressEditButton");
    public By addressDestinationInput1 = By.id("destination-cac_addressLine1");
    public By zipCodeDestinationInput = By.id("destination-cac_postalCode");
    public By cityDestinationInput = By.id("destination-cac_city");
    public By stateDestinationSelect = By.id("destination-cac_state");
    public By emailDestinationInput = By.id("destination-cac_email");
    public By phoneNumberDestinationInput = By.id("destination-cac_phone");
    public By continueResidentialAddressButton = By.id("nbsAddressClassificationContinue");
    public By scroll = By.xpath("//*[text()='Indicates required field']");




}
