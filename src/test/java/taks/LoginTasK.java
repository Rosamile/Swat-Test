package taks;

import lombok.AllArgsConstructor;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import static constans.Constans.NAME;
import static constans.Constans.PASSWORD;
import static userInterface.LoginPageUserInterface.*;



@AllArgsConstructor
public class LoginTasK implements Task {

    private static final Logger logger = LoggerFactory.getLogger(LoginTasK.class);

    String name;
    String password;

    @Override
    @Step ("The user{0} enters their credentials {0}, {0}and authenticate")


    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Clear.field(USER_NAME_FIELD),
                Clear.field(PASSWORD_FIELD),
                Enter.keyValues(name).into(USER_NAME_FIELD),
                Enter.keyValues(password).into(PASSWORD_FIELD),
                Click.on(LOGIN_BUTTON)
        );
        logger.info("Se inicia sesión al usuario");


    }


    public static LoginTasK clickOnButtonTasK(String name, String password) {
        return Tasks.instrumented(LoginTasK.class,name,password);
    }
}
