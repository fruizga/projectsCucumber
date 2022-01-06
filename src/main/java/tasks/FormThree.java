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
    private String strComputerOS;
    private String strOsVersion;
    private String strOSLanguage;
    private String strMobile;
    private String strMobileModel;
    private String strMobileOS;

    public FormThree(String strComputerOS, String strOsVersion, String strOSLanguage, String strMobile, String strMobileModel, String strMobileOS) {
        this.strComputerOS = strComputerOS;
        this.strOsVersion = strOsVersion;
        this.strOSLanguage = strOSLanguage;
        this.strMobile = strMobile;
        this.strMobileModel = strMobileModel;
        this.strMobileOS = strMobileOS;
    }


    public static FormThree onThePage(String strComputerOS, String strOsVersion, String strOSLanguage, String strMobile, String strMobileModel, String strMobileOS) {
        return Tasks.instrumented(FormThree.class, strComputerOS,strOsVersion,strOSLanguage,strMobile,strMobileModel,
                strMobileOS);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestFormThreePage.COMPUTER_OS),
                Enter.theValue(strComputerOS).into(UtestFormThreePage.OS_OPTIONS),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormThreePage.OS_OPTIONS),
                Hit.the(Keys.ENTER).into(UtestFormThreePage.OS_OPTIONS),
                Click.on(UtestFormThreePage.COMPUTER_VERSION),
                Enter.theValue(strOsVersion).into(UtestFormThreePage.VERSION_OPTIONS),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormThreePage.VERSION_OPTIONS),
                Hit.the(Keys.ENTER).into(UtestFormThreePage.VERSION_OPTIONS),
                Click.on(UtestFormThreePage.LANGUAGE),
                Enter.theValue(strOSLanguage).into(UtestFormThreePage.LANGUAGE_OPTIONS),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormThreePage.LANGUAGE_OPTIONS),
                Hit.the(Keys.ENTER).into(UtestFormThreePage.LANGUAGE_OPTIONS),
                Click.on(UtestFormThreePage.MOBILE_BRAND),
                Enter.theValue(strMobile).into(UtestFormThreePage.BRAND_OPTIONS),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormThreePage.BRAND_OPTIONS),
                Hit.the(Keys.ENTER).into(UtestFormThreePage.BRAND_OPTIONS),
                Click.on(UtestFormThreePage.MODEL),
                Enter.theValue(strMobileModel).into(UtestFormThreePage.MODEL_OPTIONS),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormThreePage.MODEL_OPTIONS),
                Hit.the(Keys.ENTER).into(UtestFormThreePage.MODEL_OPTIONS),
                Click.on(UtestFormThreePage.OS_MOBILE),
                Enter.theValue(strMobileOS).into(UtestFormThreePage.MOS_OPTIONS),
                Hit.the(Keys.ARROW_DOWN).into(UtestFormThreePage.MOS_OPTIONS),
                Hit.the(Keys.ENTER).into(UtestFormThreePage.MOS_OPTIONS),
                Click.on(UtestFormThreePage.NEXT_BUTTON)
                );
    }
}
