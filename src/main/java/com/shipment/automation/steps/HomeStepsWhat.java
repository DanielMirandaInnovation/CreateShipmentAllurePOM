package com.shipment.automation.steps;

import com.shipment.automation.models.DataInjection;
import com.shipment.automation.pageobjects.HomePageWhat;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

import static com.shipment.automation.utils.SpecialMethods.*;

public class HomeStepsWhat {
    HomePageWhat homePageWhat = new HomePageWhat();
    DataInjection dataInjection = new DataInjection();
    @Step
    public void whatKindOfPackagingAreYouUsing(){
        homePageWhat.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        waitFor(2);
        write(homePageWhat.getDriver(), homePageWhat.weightInput, dataInjection.getWeight());
        clickJS(homePageWhat.getDriver(), homePageWhat.continueButton);
    }

}
