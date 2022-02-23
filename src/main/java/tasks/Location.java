package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import userinterface.LocationPage;

import java.util.List;


public class Location implements Task {
    private List<UtestData> utestData;

    public Location(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static Location onThePage(List<UtestData> utestData) {
        return Tasks.instrumented(Location.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LocationPage.CITY),
                Enter.theValue(utestData.get(0).getStrCity()).into(LocationPage.CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(LocationPage.CITY),
                Hit.the(Keys.ENTER).into(LocationPage.CITY),
                Enter.theValue(utestData.get(0).getStrZipCode()).into(LocationPage.ZIP_CODE),
                //Click.on(LocationPage.CITY_MAP),
                Click.on(LocationPage.NEXT_BUTTON)
                );
    }
}
