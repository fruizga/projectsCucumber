package co.com.choucair.certification.utestproject.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UtestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.*;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class WorldUtestStepDefinitions {
    @Before
    public void setStage (){
        setTheStage(new OnlineCast());
    }

    @Given("^than Evaristo wants to join the uTest community$")
    public void thanEvaristoWantsToJoinTheUTestCommunity(List<UtestData> utestData) throws Exception{
        theActorCalled("Evaristo").wasAbleTo(OpenUp.thePage(),
                (PersonalInformation.onThePage(utestData)));
    }

    @When("^he search for the registration form in the uTest community web page$")
    public void heSearchForTheRegistrationFormInTheUTestCommunityWebPage(List<UtestData> utestData) {
        theActorInTheSpotlight().attemptsTo(Location.onThePage(utestData));
        theActorInTheSpotlight().attemptsTo(Device.onThePage(utestData));
        theActorInTheSpotlight().attemptsTo(SecurityPolicy.onThePage(utestData));
    }

    @Then("^he registers his information and see the (.*)$")
    public void heRegistersHisInformationAndSeeTheAccountRegisterConfirmation(String question) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }



}
