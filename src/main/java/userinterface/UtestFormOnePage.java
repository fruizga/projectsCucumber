package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestFormOnePage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("Button that shows us the registration " +
            "personal form").located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target FIRST_NAME = Target.the("where we write " +
            "the first name").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("where we write " +
            "the last name").located(By.id("lastName"));
    public static final Target EMAIL_ADDRESS = Target.the("where we write " +
            "the EMAIL ADDRESS").located(By.id("email"));
    public static final Target BIRTH_MONTH = Target.the("where we select " +
            "the month of birth").located(By.id("birthMonth"));
    public static final Target BIRTH_DAY = Target.the("where we select " +
            "the day of birth").located(By.id("birthDay"));
    public static final Target BIRTH_YEAR = Target.the("where we select " +
            "the year of birth").located(By.id("birthYear"));
    public static final Target NEXT_BUTTON = Target.the("button to " +
            "continue to the next form").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
