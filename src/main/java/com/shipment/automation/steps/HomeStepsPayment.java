package com.shipment.automation.steps;

import com.shipment.automation.pageobjects.HomePagePayment;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

import static com.shipment.automation.utils.SpecialMethods.*;

public class HomeStepsPayment {

    HomePagePayment homePagePayment = new HomePagePayment();

    @Step
    public void howWouldYouLikeToPay(){
        homePagePayment.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        waitFor(1);
        scroll(homePagePayment.getDriver(), homePagePayment.scroll);
        waitFor(1);
        clickJS(homePagePayment.getDriver(), homePagePayment.paypalOption);
        waitFor(1);
        clickJS(homePagePayment.getDriver(), homePagePayment.reviewButton);

    }
}
