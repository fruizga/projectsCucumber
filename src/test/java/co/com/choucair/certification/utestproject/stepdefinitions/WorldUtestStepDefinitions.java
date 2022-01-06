package co.com.choucair.certification.utestproject.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UtestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.*;

import java.util.List;

public class WorldUtestStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Evaristo wants to join the uTest community$")
    public void thanEvaristoWantsToJoinTheUTestCommunity(List<UtestData> utestData) throws Exception{
        OnStage.theActorCalled("Evaristo").wasAbleTo(OpenUp.thePage(),
                (FormOne.onThePage(utestData.get(0).getStrFirstName(),
                        utestData.get(0).getStrLastName(), utestData.get(0).getStrEmail(), utestData.get(0).getStrBirthMonth(),
                        utestData.get(0).getStrBirthDay(), utestData.get(0).getStrBirthYear(), utestData.get(0).getStrLanguage())));
    }

    @When("^he search for the registration form in the uTest community web page$")
    public void heSearchForTheRegistrationFormInTheUTestCommunityWebPage(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Fill.onThePage(utestData.get(0).getStrCity(), utestData.get(0).getStrZipCode()));
        OnStage.theActorInTheSpotlight().attemptsTo(FormThree.onThePage(utestData.get(0).getStrComputerOS(),
                utestData.get(0).getStrOsVersion(), utestData.get(0).getStrOSLanguage(),utestData.get(0).getStrMobile(),
                utestData.get(0).getStrMobileModel(), utestData.get(0).getStrMobileOS()));
        OnStage.theActorInTheSpotlight().attemptsTo(LastForm.onThePage(utestData.get(0).getStrPassword(),
                utestData.get(0).getStrConfirmPass()));
    }

    @Then("^he registers his information and see the (.*)$")
    public void heRegistersHisInformationAndSeeTheAccountRegisterConfirmation(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }



}
