package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.UtestFormOnePage;

public class FormOne implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;
    private String strLanguage;

    public FormOne(String strFirstName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay,
                   String strBirthYear, String strLanguage) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
        this.strLanguage = strLanguage;
    }

    public static FormOne onThePage(String strFirstName, String strLastName, String strEmail,
                                    String strBirthMonth, String strBirthDay, String strBirthYear, String strLanguage) {

        return Tasks.instrumented(FormOne.class, strFirstName,strLastName,strEmail,strBirthMonth,strBirthDay,
                strBirthYear,strLanguage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestFormOnePage.JOIN_BUTTON),
                Enter.theValue(strFirstName).into(UtestFormOnePage.FIRST_NAME),
                Enter.theValue(strLastName).into(UtestFormOnePage.LAST_NAME),
                Enter.theValue(strEmail).into(UtestFormOnePage.EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(strBirthMonth).from(UtestFormOnePage.BIRTH_MONTH),
                SelectFromOptions.byVisibleText(strBirthDay).from(UtestFormOnePage.BIRTH_DAY),
                SelectFromOptions.byVisibleText(strBirthYear).from(UtestFormOnePage.BIRTH_YEAR),
                Enter.theValue(strLanguage).into(UtestFormOnePage.LANGUAGE),
                Click.on(UtestFormOnePage.NEXT_BUTTON));
    }
}
