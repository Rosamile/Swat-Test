package userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CheckOutInformationUserInterface extends PageObject {
    public static final Target FIRST_NAME_BOX = Target.the("user first name")
            .locatedBy("//*[@id=\"first-name\"]");

    public static final Target LAST_NAME_BOX = Target.the("user last name")
            .locatedBy("//*[@id=\"last-name\"]");

   public static final Target POSTAL_CODE_BOX = Target.the("user postal code")
            .locatedBy("//*[@id=\"postal-code\"]");


   public static final Target BUTTON_CONTINUE_CHECK = Target.the("Button continue")
            .locatedBy("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input");





}
