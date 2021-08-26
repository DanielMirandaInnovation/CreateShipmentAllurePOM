package com.shipment.automation.steps;

import com.shipment.automation.models.DataInjection;
import com.shipment.automation.pageobjects.HomePageWhere;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

import static com.shipment.automation.utils.SpecialMethods.*;
import static com.shipment.automation.pageobjects.HomePageWhere.*;

public class HomeStepsWhere {

    public HomePageWhere homePageWhere = new HomePageWhere();
    DataInjection dataInjection = new DataInjection();
    DataInjection dataInjectionTwo = new DataInjection();

    @Step
    public void openBrowser(){
        homePageWhere.open();
    }

    @Step
    public void whereAreYouShippingFrom(){

        homePageWhere.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        scroll(homePageWhere.getDriver(), homePageWhere.scroll);
        write(homePageWhere.getDriver(),nameOrigenInput, dataInjection.getName());
        write(homePageWhere.getDriver(),contactNameOrigenInput, dataInjection.getContactName());
        clickJS(homePageWhere.getDriver(), homePageWhere.editAddressButton);
        waitFor(1);
        write(homePageWhere.getDriver(), homePageWhere.addressOrigenInput1, dataInjection.getAddress());
        write(homePageWhere.getDriver(), homePageWhere.zipCodeOriginInput, dataInjection.getZipCodeMiami());
        write(homePageWhere.getDriver(), homePageWhere.cityOrigenInput, dataInjectionTwo.getCityOrigen());
        clickJS(homePageWhere.getDriver(), homePageWhere.stateOrigenSelect);
        waitFor(1);
        clickJS(homePageWhere.getDriver(), homePageWhere.floridaOptionList);
        write(homePageWhere.getDriver(), homePageWhere.emailOrigenInput, dataInjection.getEmail());
        waitFor(1);
        write(homePageWhere.getDriver(), homePageWhere.phoneNumberOrigenInput, dataInjection.getPhoneNumber());
        waitFor(1);
        write(homePageWhere.getDriver(), homePageWhere.extensionPhoneOrigenInput, dataInjection.getExtensionNumber());
        clickJS(homePageWhere.getDriver(), homePageWhere.continueButton);
    }

    @Step
    public void whereIsYourShipmentGoing(){
        homePageWhere.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        scroll(homePageWhere.getDriver(), homePageWhere.scroll);
        write(homePageWhere.getDriver(), homePageWhere.nameDestinationInput, dataInjectionTwo.getName());
        write(homePageWhere.getDriver(), homePageWhere.contactNameDestinationInput, dataInjectionTwo.getContactName());
        waitFor(1);
        clickJS(homePageWhere.getDriver(), homePageWhere.editAddressDestinationButton);
        write(homePageWhere.getDriver(), homePageWhere.addressDestinationInput1, dataInjectionTwo.getAddress());
        write(homePageWhere.getDriver(), homePageWhere.zipCodeDestinationInput, dataInjectionTwo.getZipCodeAlabama());
        write(homePageWhere.getDriver(), homePageWhere.cityDestinationInput, dataInjectionTwo.getCityDestination());
        clickJS(homePageWhere.getDriver(), homePageWhere.stateDestinationSelect);
        waitFor(1);
        clickJS(homePageWhere.getDriver(), homePageWhere.alabamaOptionList);
        write(homePageWhere.getDriver(), homePageWhere.emailDestinationInput, dataInjectionTwo.getEmail());
        write(homePageWhere.getDriver(), homePageWhere.phoneNumberDestinationInput, dataInjectionTwo.getPhoneNumber());
        waitFor(1);
        clickJS(homePageWhere.getDriver(), homePageWhere.continueButton);
        clickJS(homePageWhere.getDriver(), homePageWhere.continueResidentialAddressButton);
    }




}
