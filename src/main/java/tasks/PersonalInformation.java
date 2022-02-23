package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.PersonalInformationPage;

import java.util.List;

public class PersonalInformation implements Task {
    private List<UtestData> utestData;

    public PersonalInformation(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static PersonalInformation onThePage(List<UtestData> utestData) {

        return Tasks.instrumented(PersonalInformation.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PersonalInformationPage.JOIN_BUTTON),
                Enter.theValue(utestData.get(0).getStrFirstName()).into(PersonalInformationPage.FIRST_NAME),
                Enter.theValue(utestData.get(0).getStrLastName()).into(PersonalInformationPage.LAST_NAME),
                Enter.theValue(utestData.get(0).getStrEmail()).into(PersonalInformationPage.EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(utestData.get(0).getStrBirthMonth()).from(PersonalInformationPage.BIRTH_MONTH),
                SelectFromOptions.byVisibleText(utestData.get(0).getStrBirthDay()).from(PersonalInformationPage.BIRTH_DAY),
                SelectFromOptions.byVisibleText(utestData.get(0).getStrBirthYear()).from(PersonalInformationPage.BIRTH_YEAR),
                Enter.theValue(utestData.get(0).getStrLanguage()).into(PersonalInformationPage.LANGUAGE),
                Click.on(PersonalInformationPage.NEXT_BUTTON));
    }
}
