package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SecurityPolicyPage;

import java.util.List;

public class SecurityPolicy implements Task {
    private List<UtestData> utestData;

    public SecurityPolicy(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static SecurityPolicy onThePage(List<UtestData> utestData) {
        return Tasks.instrumented(SecurityPolicy.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(utestData.get(0).getStrPassword()).into(SecurityPolicyPage.PASSWORD),
                Enter.theValue(utestData.get(0).getStrConfirmPass()).into(SecurityPolicyPage.CONFIRM_PASS),
                Click.on(SecurityPolicyPage.OPTIONAL),
                Click.on(SecurityPolicyPage.USE_TERMS),
                Click.on(SecurityPolicyPage.PRIVACY_POLICY),
                Click.on(SecurityPolicyPage.COMPLETE_SETUP)
                );
    }
}
