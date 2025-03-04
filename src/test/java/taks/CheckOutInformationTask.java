package taks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static constans.Constans.*;
import static userInterface.CheckOutInformationUserInterface.*;
import static userInterface.CheckOutOverViewUserInterface.FINISH_BUTTON;

public class CheckOutInformationTask implements Task {


    @Override
    @Step("{0}the user enters their information {string}, {string} and {string} and clicks the continue button")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(FIRST_NAME_BOX),
                Clear.field(LAST_NAME_BOX),
                Clear.field(POSTAL_CODE_BOX),
                Enter.keyValues(FIRST_NAME).into(FIRST_NAME_BOX),
                Enter.keyValues(LAST_NAME).into(LAST_NAME_BOX),
                Enter.keyValues(POSTAL_CODE).into(POSTAL_CODE_BOX),
                Click.on(BUTTON_CONTINUE_CHECK)


        );

    }
    public static CheckOutInformationTask fillCheckoutForm(String firstName, String lastName, String postalCode) {
        return Tasks.instrumented(CheckOutInformationTask.class);
    }

}
