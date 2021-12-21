package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FillFormPage extends PageObject {
    public static final Target CITY = Target.the("where we type the city").located(By.id("city"));
    public static final Target CITY_MAP = Target.the("where we type the city").located(By.xpath("//*" +
            "[@id=\"map\"]/div/div/div[2]/div[2]"));
    public static final Target ZIP_CODE = Target.the("where we type the zip or " +
            "postal code").located(By.id("zip"));
    public static final Target NEXT_BUTTON = Target.the("button to " +
            "continue to the next form").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]" +
            "/div/form/div[2]/div/a"));
}
