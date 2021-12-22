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
    public static LastForm onThePage() {
        return Tasks.instrumented(LastForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("TypeYourPassword123**@@").into(LastFormPage.PASSWORD),
                Enter.theValue("TypeYourPassword123**@@").into(LastFormPage.CONFIRM_PASS),
                Click.on(LastFormPage.OPTIONAL),
                Click.on(LastFormPage.USE_TERMS),
                Click.on(LastFormPage.PRIVACY_POLICY),
                Click.on(LastFormPage.COMPLETE_SETUP)
                );
    }
}
