package com.shipment.automation.steps;

import com.shipment.automation.pageobjects.HomePageHow;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

import static com.shipment.automation.utils.SpecialMethods.*;

public class HomeStepsHow {
    HomePageHow homePageHow =new HomePageHow();
    @Step
    public void howWouldYouLikeToShip(){
        homePageHow.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        waitFor(2);
        scroll(homePageHow.getDriver(), homePageHow.scroll);
        clickJS(homePageHow.getDriver(), homePageHow.continueButton);
    }

}
