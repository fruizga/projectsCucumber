package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DevicePage extends PageObject {

    public static final Target COMPUTER_OS = Target.the("where we select " +
            "the computer OS").located(By.xpath("//span[@aria-label='Select OS']"));
    public static final Target OS_OPTIONS = Target.the("" +
            " we select " +
            "the computer OS").located(By.xpath("//input[@placeholder='Select OS']"));
    public static final Target COMPUTER_VERSION = Target.the("where we select " +
            "the computer OS").located(By.xpath("//span[@aria-label='Select a Version']"));
    public static final Target VERSION_OPTIONS = Target.the("where we select " +
            "the computer OS").located(By.xpath("//input[@placeholder='Select a Version']"));
    public static final Target LANGUAGE = Target.the("where we select " +
            "the OS language").located(By.xpath("//span[@aria-label='Select OS language']"));
    public static final Target LANGUAGE_OPTIONS = Target.the("where we select " +
            "the OS language").located(By.xpath("//input[@placeholder='Select OS language']"));
    public static final Target MOBILE_BRAND = Target.the("where we select " +
            "the mobile brand").located(By.xpath("//span[@aria-label='Select Brand']"));
    public static final Target BRAND_OPTIONS = Target.the("where we select " +
            "the mobile brand").located(By.xpath("//input[@placeholder='Select Brand']"));
    public static final Target MODEL = Target.the("where we select " +
            "the mobile brand").located(By.xpath("//span[@aria-label='Select a Model']"));
    public static final Target MODEL_OPTIONS = Target.the("where we select " +
            "the mobile brand").located(By.xpath("//input[@placeholder='Select a Model']"));
    public static final Target OS_MOBILE = Target.the("where we select " +
            "the mobile brand").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target MOS_OPTIONS = Target.the("where we select " +
            "the mobile brand").located(By.xpath("//input[@aria-owns='ui-select-choices-8']"));
    public static final Target NEXT_BUTTON = Target.the("button to " +
            "continue to the next form").located(By.xpath("//a[@aria-label='Next - final step']"));
}
