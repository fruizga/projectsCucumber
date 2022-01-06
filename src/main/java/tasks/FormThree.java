package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
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
                Enter.theValue("Xubuntu").into(UtestFormThreePage.OS_OPTIONS),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormThreePage.OS_OPTIONS),
                Hit.the(Keys.ENTER).into(UtestFormThreePage.OS_OPTIONS),
                Click.on(UtestFormThreePage.COMPUTER_VERSION),
                Enter.theValue("Xubuntu 18.04").into(UtestFormThreePage.VERSION_OPTIONS),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormThreePage.VERSION_OPTIONS),
                Hit.the(Keys.ENTER).into(UtestFormThreePage.VERSION_OPTIONS),
                Click.on(UtestFormThreePage.LANGUAGE),
                Enter.theValue("Spanish").into(UtestFormThreePage.LANGUAGE_OPTIONS),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormThreePage.LANGUAGE_OPTIONS),
                Hit.the(Keys.ENTER).into(UtestFormThreePage.LANGUAGE_OPTIONS),
                Click.on(UtestFormThreePage.MOBILE_BRAND),
                Enter.theValue("Kalley").into(UtestFormThreePage.BRAND_OPTIONS),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormThreePage.BRAND_OPTIONS),
                Hit.the(Keys.ENTER).into(UtestFormThreePage.BRAND_OPTIONS),
                Click.on(UtestFormThreePage.MODEL),
                Enter.theValue("Element Max").into(UtestFormThreePage.MODEL_OPTIONS),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormThreePage.MODEL_OPTIONS),
                Hit.the(Keys.ENTER).into(UtestFormThreePage.MODEL_OPTIONS),
                Click.on(UtestFormThreePage.OS_MOBILE),
                Enter.theValue("Android 8.1").into(UtestFormThreePage.MOS_OPTIONS),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormThreePage.MOS_OPTIONS),
                Hit.the(Keys.ENTER).into(UtestFormThreePage.MOS_OPTIONS),
                Click.on(UtestFormThreePage.NEXT_BUTTON)
                );
    }
}
