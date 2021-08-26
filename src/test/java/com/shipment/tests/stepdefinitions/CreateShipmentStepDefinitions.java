package com.shipment.tests.stepdefinitions;

import com.shipment.automation.models.DataInjection;
import com.shipment.automation.steps.*;

import static com.shipment.automation.utils.SpecialMethods.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class CreateShipmentStepDefinitions {

    DataInjection dataInjection = new DataInjection();
    @Steps
    HomeStepsWhere homeStepsWhere;
    @Steps
    HomeStepsWhat homeStepsWhat;
    @Steps
    HomeStepsHow homeStepsHow;
    @Steps
    HomeStepsDetails homeStepsDetails;
    @Steps
    HomeStepsPayment homeStepsPayment;
    @Steps
    HomeStepsReview homeStepsReview;

    @Given("^that a web user wants to create a shipment$")
    public void thatAWebUserWantsToCreateAShipment() {
        homeStepsWhere.openBrowser();
    }

    @When("^he fills all the requested fields$")
    public void heFillsAllTheRequestedFields() {
        homeStepsWhere.whereAreYouShippingFrom();
        homeStepsWhere.whereIsYourShipmentGoing();
        homeStepsWhat.whatKindOfPackagingAreYouUsing();
        homeStepsHow.howWouldYouLikeToShip();
        homeStepsDetails.letsCheckFewMoreDetails();
        homeStepsPayment.howWouldYouLikeToPay();
        homeStepsReview.reviewCreateShipment();
    }

    @Then("^he should see the created shipment\\.$")
    public void heShouldSeeTheCreatedShipment() {
        validations(homeStepsWhere.homePageWhere.getDriver(), homeStepsReview.homePageReview.paypalValidation, dataInjection.getExpectedString());
    }

}
