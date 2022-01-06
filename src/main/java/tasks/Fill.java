package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import userinterface.FillFormPage;
import userinterface.UtestFormOnePage;


public class Fill implements Task {

    public static Fill onThePage() {
        return Tasks.instrumented(Fill.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Sabaneta").into(FillFormPage.CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(FillFormPage.CITY),
                Hit.the(Keys.ENTER).into(FillFormPage.CITY),
                Click.on(FillFormPage.CITY_MAP),
                Enter.theValue("055428").into(FillFormPage.ZIP_CODE),
                Click.on(FillFormPage.NEXT_BUTTON)
                );
    }
}
