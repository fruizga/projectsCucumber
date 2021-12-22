package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestFormThreePage extends PageObject {
    public static final Target COMPUTER_OS = Target.the("where we select " +
            "the computer OS").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/" +
            "div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span"));
    public static final Target OS_OPTIONS = Target.the("where we select " +
            "the computer OS options").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/" +
            "div[1]/div[3]/div[1]/div[1]/div[2]/div/ul/li/div[5]/span"));
    public static final Target COMPUTER_VERSION = Target.the("where we select " +
            "the OS version").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]" +
            "/div[3]/div[1]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target VERSION_OPTIONS = Target.the("where we select " +
            "the version options").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]" +
            "/div[3]/div[1]/div[2]/div[2]/div/ul/li/div[16]/span"));
    public static final Target LANGUAGE = Target.the("where we select " +
            "the OS language").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]" +
            "/div[3]/div[1]/div[3]/div[2]/div/div[1]/span"));
    public static final Target LANGUAGE_OPTIONS = Target.the("where we select " +
            "the OS language options").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]" +
            "/div[3]/div[1]/div[3]/div[2]/div/ul/li/div[40]/span"));
    public static final Target MOBILE_BRAND = Target.the("where we select " +
            "the mobile brand").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]" +
            "/div[3]/div[2]/div[1]/div[2]/div/div[1]/span"));
    public static final Target BRAND_OPTIONS = Target.the("where we select " +
            "the mobile brand options").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]" +
            "/div[3]/div[2]/div[1]/div[2]/div/ul/li/div[4]/span/div"));
    public static final Target MODEL = Target.the("where we select " +
            "the mobile model").located(By.xpath("//html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]" +
            "/div[3]/div[2]/div[2]/div[2]/div/div[1]/span"));
    public static final Target MODEL_OPTIONS = Target.the("where we select " +
            "the mobile model options").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]" +
            "/div[3]/div[2]/div[2]/div[2]/div/ul/li/div[82]/span/div"));
    public static final Target OS_MOBILE = Target.the("where we select " +
            "the mobile OS").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]" +
            "/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));
    public static final Target MOS_OPTIONS = Target.the("where we select " +
            "the mobile OS options").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]" +
            "/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[5]/span/div"));
    public static final Target NEXT_BUTTON = Target.the("button to " +
            "continue to the next form").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]" +
            "/div/div[2]/div/a"));
}
