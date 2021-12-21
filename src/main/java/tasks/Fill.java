package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.FillFormPage;
import userinterface.UtestFormOnePage;

public class Fill implements Task {

    public static Fill onThePage() {
        return Tasks.instrumented(Fill.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Envigado").into(FillFormPage.CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(FillFormPage.CITY),
                Click.on(FillFormPage.CITY_MAP),
                Enter.theValue("055428").into(FillFormPage.ZIP_CODE),
                Click.on(FillFormPage.NEXT_BUTTON));
    }
}
