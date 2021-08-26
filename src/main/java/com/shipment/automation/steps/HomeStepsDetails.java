package com.shipment.automation.steps;

import com.shipment.automation.models.DataInjection;
import com.shipment.automation.pageobjects.HomePageDetails;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

import static com.shipment.automation.utils.SpecialMethods.*;
import static com.shipment.automation.utils.SpecialMethods.clickJS;

public class HomeStepsDetails {

    HomePageDetails homePageDetails = new HomePageDetails();
    DataInjection dataInjection = new DataInjection();

    @Step
    public void letsCheckFewMoreDetails(){
        homePageDetails.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        waitFor(2);
        scroll(homePageDetails.getDriver(), homePageDetails.scroll);
        write(homePageDetails.getDriver(), homePageDetails.descriptionProductInput, dataInjection.getDescriptionProduct());
        clickJS(homePageDetails.getDriver(), homePageDetails.continueButton);
    }
}
