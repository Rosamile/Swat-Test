package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.page.TheWebPage;


public class LoginSuccessful implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return TheWebPage.title().answeredBy(actor);
    }

    public static LoginSuccessful isDisplayed(){
        return  new LoginSuccessful();
    }
}
