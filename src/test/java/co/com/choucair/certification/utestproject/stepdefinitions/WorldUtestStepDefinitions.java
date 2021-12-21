package co.com.choucair.certification.utestproject.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class WorldUtestStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Evaristo wants to join the uTest community$")
    public void thanEvaristoWantsToJoinTheUTestCommunity() {

    }

    @When("^he search for the registration form in the uTest community web page$")
    public void heSearchForTheRegistrationFormInTheUTestCommunityWebPage() {

    }

    @Then("^he registers his information and see the account register confirmation$")
    public void heRegistersHisInformationAndSeeTheAccountRegisterConfirmation() {

    }



}
