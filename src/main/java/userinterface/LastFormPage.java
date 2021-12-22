package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LastFormPage extends PageObject {
    public static final Target PASSWORD = Target.the("where we type the password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASS = Target.the("where we type the password again")
            .located(By.id("confirmPassword"));
    public static final Target OPTIONAL = Target.the("where we select " +
            "the optional check").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]" +
            "/div/form/div[4]/label/span"));
    public static final Target USE_TERMS = Target.the("where we select " +
            "the Terms check").located(By.xpath("//*[@id=\"termOfUse\"]"));
    public static final Target PRIVACY_POLICY = Target.the("where we select " +
            "the privacy check").located(By.xpath("//html/body/ui-view/main/section/div/div[2]" +
            "/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_SETUP = Target.the("button to complete " +
            "the registration").located(By.xpath("//*[@id=\"laddaBtn\"]"));
    public static final Target CONFIRMATION = Target.the("where we view the " +
            "confirmation about the register").located(By.xpath("/html/body/ui-view/unauthenticated-container" +
            "/div/div/div/ui-view/div/div/div/div[1]/div/h1"));

}
