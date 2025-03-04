package userInterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class LoginPageUserInterface extends PageObject {
    public static final Target USER_NAME_FIELD = Target.the("User Name field")
            .locatedBy("[data-test='username']");

    public static final Target PASSWORD_FIELD = Target.the("Password field")
            .locatedBy("[data-test='password']");

    public static final Target LOGIN_BUTTON = Target.the("Login button")
            .locatedBy("//*[@id=\"login-button\"]");

    public static final Target ERROR_MSG = Target.the("Mensaje de error de inicio de sesion")
            .locatedBy("//h3[@data-test='error']");

}
