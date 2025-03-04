package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userInterface.LoginPageUserInterface.ERROR_MSG;


public class LoginNoSucessFull implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {

        return Text.of(ERROR_MSG).answeredBy(actor);

    }

    public static LoginNoSucessFull loginNoSucessFull(){
        return new LoginNoSucessFull();
    }
}
