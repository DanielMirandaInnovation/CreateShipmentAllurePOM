package com.shipment.automation.steps;

import com.shipment.automation.pageobjects.HomePageReview;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

import static com.shipment.automation.utils.SpecialMethods.*;
import static com.shipment.automation.utils.SpecialMethods.clickJS;

public class HomeStepsReview {
    public HomePageReview homePageReview = new HomePageReview();
    @Step
    public void reviewCreateShipment(){
        homePageReview.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        waitFor(1);
        visibleComponentValidation(homePageReview.getDriver(), homePageReview.shipFromValidation);
        visibleComponentValidation(homePageReview.getDriver(), homePageReview.shipToValidation);
        visibleComponentValidation(homePageReview.getDriver(), homePageReview.packageInformationValidation);
        visibleComponentValidation(homePageReview.getDriver(), homePageReview.shippingServiceValidation);
        visibleComponentValidation(homePageReview.getDriver(), homePageReview.additionalOptionValidation);
        visibleComponentValidation(homePageReview.getDriver(), homePageReview.paymentValidation);
        scroll(homePageReview.getDriver(), homePageReview.termsAndConditionsCheckbox);
        clickJS(homePageReview.getDriver(), homePageReview.termsAndConditionsCheckbox);
        clickJS(homePageReview.getDriver(), homePageReview.payAndGetLabels);
    }

}
