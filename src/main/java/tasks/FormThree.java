package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.FillFormPage;
import userinterface.UtestFormOnePage;
import userinterface.UtestFormThreePage;

public class FormThree implements Task {
    public static FormThree onThePage() {
        return Tasks.instrumented(FormThree.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestFormThreePage.COMPUTER_OS),
                Click.on(UtestFormThreePage.OS_OPTIONS),
                Click.on(UtestFormThreePage.COMPUTER_VERSION),
                Click.on(UtestFormThreePage.VERSION_OPTIONS),
                Click.on(UtestFormThreePage.LANGUAGE),
                Click.on(UtestFormThreePage.LANGUAGE_OPTIONS),
                Click.on(UtestFormThreePage.MOBILE_BRAND),
                Click.on(UtestFormThreePage.BRAND_OPTIONS),
                Click.on(UtestFormThreePage.MODEL),
                Click.on(UtestFormThreePage.MODEL_OPTIONS),
                Click.on(UtestFormThreePage.OS_MOBILE),
                Click.on(UtestFormThreePage.MOS_OPTIONS),
                Click.on(UtestFormThreePage.NEXT_BUTTON)
                );
    }
}
