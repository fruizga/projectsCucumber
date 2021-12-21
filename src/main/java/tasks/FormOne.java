package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.UtestFormOnePage;

public class FormOne implements Task {
    public static FormOne onThePage() {
        return Tasks.instrumented(FormOne.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestFormOnePage.JOIN_BUTTON),
                Enter.theValue("TypeYourFirstName").into(UtestFormOnePage.FIRST_NAME),
                Enter.theValue("TypeYourLastName").into(UtestFormOnePage.LAST_NAME),
                Enter.theValue("TypeYourEmail@example.com").into(UtestFormOnePage.EMAIL_ADDRESS),
                SelectFromOptions.byIndex(5).from(UtestFormOnePage.BIRTH_MONTH),
                SelectFromOptions.byIndex(21).from(UtestFormOnePage.BIRTH_DAY),
                SelectFromOptions.byIndex(13).from(UtestFormOnePage.BIRTH_YEAR),
                Click.on(UtestFormOnePage.NEXT_BUTTON));
    }
}
