package taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userInterface.CheckOutOverViewUserInterface.FINISH_BUTTON;

public class FinishButton implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FINISH_BUTTON)
        );
    }

    public static FinishButton finishButton(){
        return Tasks.instrumented(FinishButton.class);
    }
}
