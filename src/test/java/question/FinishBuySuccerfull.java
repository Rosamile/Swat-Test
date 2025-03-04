package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userInterface.CheckOutOverViewUserInterface.FINISH_MESSAGE;

public class FinishBuySuccerfull implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(FINISH_MESSAGE).answeredBy(actor);
    }

    public static FinishBuySuccerfull successfulMessage() {
        return new FinishBuySuccerfull();
    }
}
