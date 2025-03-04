package userInterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class CheckOutOverViewUserInterface extends PageObject {
    public static final Target TITLE_CHECK_OUT_OVER = Target.the("Checkout: Your Information")
            .locatedBy("//*[@id=\"contents_wrapper\"]/div[2]");

    public static final Target CHECK_OUT_OVER_BUTTON = Target.the("Check out button")
            .locatedBy("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]");

    public  static final Target FINISH_BUTTON = Target.the("Finish button")
            .locatedBy("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]");

    public  static final Target FINISH_MESSAGE = Target.the("Finish MESSAGE")
            .locatedBy("//*[@id=\"checkout_complete_container\"]/h2");



}
