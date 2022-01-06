package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.LastFormPage;
import userinterface.UtestFormOnePage;
import userinterface.UtestFormThreePage;

public class LastForm implements Task {
    private String strPassword;
    private String strConfirmPass;

    public LastForm(String strPassword, String strConfirmPass) {
        this.strPassword = strPassword;
        this.strConfirmPass = strConfirmPass;
    }

    public static LastForm onThePage(String strPassword, String strConfirmPass) {
        return Tasks.instrumented(LastForm.class, strPassword,strConfirmPass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strPassword).into(LastFormPage.PASSWORD),
                Enter.theValue(strConfirmPass).into(LastFormPage.CONFIRM_PASS),
                Click.on(LastFormPage.OPTIONAL),
                Click.on(LastFormPage.USE_TERMS),
                Click.on(LastFormPage.PRIVACY_POLICY),
                Click.on(LastFormPage.COMPLETE_SETUP)
                );
    }
}
