package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.DevicePage;

import java.util.List;

public class Device implements Task {

    private List<UtestData> utestData;

    public Device(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static Device onThePage(List<UtestData> utestData) {
        return Tasks.instrumented(Device.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DevicePage.COMPUTER_OS),
                Enter.theValue(utestData.get(0).getStrComputerOS()).into(DevicePage.OS_OPTIONS),
                Hit.the(Keys.ARROW_DOWN).into(DevicePage.OS_OPTIONS),
                Hit.the(Keys.ENTER).into(DevicePage.OS_OPTIONS),
                Click.on(DevicePage.COMPUTER_VERSION),
                Enter.theValue(utestData.get(0).getStrOsVersion()).into(DevicePage.VERSION_OPTIONS),
                Hit.the(Keys.ARROW_DOWN).into(DevicePage.VERSION_OPTIONS),
                Hit.the(Keys.ENTER).into(DevicePage.VERSION_OPTIONS),
                Click.on(DevicePage.LANGUAGE),
                Enter.theValue(utestData.get(0).getStrOSLanguage()).into(DevicePage.LANGUAGE_OPTIONS),
                Hit.the(Keys.ARROW_DOWN).into(DevicePage.LANGUAGE_OPTIONS),
                Hit.the(Keys.ENTER).into(DevicePage.LANGUAGE_OPTIONS),
                Click.on(DevicePage.MOBILE_BRAND),
                Enter.theValue(utestData.get(0).getStrMobile()).into(DevicePage.BRAND_OPTIONS),
                Hit.the(Keys.ARROW_DOWN).into(DevicePage.BRAND_OPTIONS),
                Hit.the(Keys.ENTER).into(DevicePage.BRAND_OPTIONS),
                Click.on(DevicePage.MODEL),
                Enter.theValue(utestData.get(0).getStrMobileModel()).into(DevicePage.MODEL_OPTIONS),
                Hit.the(Keys.ARROW_DOWN).into(DevicePage.MODEL_OPTIONS),
                Hit.the(Keys.ENTER).into(DevicePage.MODEL_OPTIONS),
                Click.on(DevicePage.OS_MOBILE),
                Enter.theValue(utestData.get(0).getStrMobileOS()).into(DevicePage.MOS_OPTIONS),
                Hit.the(Keys.ARROW_DOWN).into(DevicePage.MOS_OPTIONS),
                Hit.the(Keys.ENTER).into(DevicePage.MOS_OPTIONS),
                Click.on(DevicePage.NEXT_BUTTON)
                );
    }
}
