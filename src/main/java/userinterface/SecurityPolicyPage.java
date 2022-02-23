package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SecurityPolicyPage extends PageObject {
    public static final Target PASSWORD = Target.the("where we type the password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASS = Target.the("where we type the password again")
            .located(By.id("confirmPassword"));
    public static final Target OPTIONAL = Target.the("where we select " +
            "the computer OS").located(By.xpath("//input[@name='newsletterOptIn']"));
    public static final Target USE_TERMS = Target.the("where we select " +
            "the computer OS").located(By.xpath("//*[@id=\"termOfUse\"]"));
    public static final Target PRIVACY_POLICY = Target.the("where we select " +
            "the computer OS").located(By.xpath("//input[@name='privacySetting']"));
    public static final Target COMPLETE_SETUP = Target.the("where we select " +
            "the computer OS").located(By.id("laddaBtn"));
    public static final Target CONFIRMATION = Target.the("where we select " +
            "the computer OS").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));

}
