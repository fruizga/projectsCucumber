package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import userinterface.FillFormPage;
import userinterface.UtestFormOnePage;


public class Fill implements Task {
    private String strCity;
    private String strZipCode;

    public Fill(String strCity, String strZipCode) {
        this.strCity = strCity;
        this.strZipCode = strZipCode;
    }



    public static Fill onThePage(String strCity, String strZipCode) {
        return Tasks.instrumented(Fill.class, strCity, strZipCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strCity).into(FillFormPage.CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(FillFormPage.CITY),
                Hit.the(Keys.ENTER).into(FillFormPage.CITY),
                Click.on(FillFormPage.CITY_MAP),
                Enter.theValue(strZipCode).into(FillFormPage.ZIP_CODE),
                Click.on(FillFormPage.NEXT_BUTTON)
                );
    }
}
