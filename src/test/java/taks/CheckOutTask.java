package taks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static userInterface.ProductsPageUserInterface.CHECKOUT_BUTTON;

public class CheckOutTask implements Task {

    @Override
    @Step ("the user clicks the checkout button")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CHECKOUT_BUTTON)
        );
    }

    public static CheckOutTask checkOutTask(){
        return Tasks.instrumented(CheckOutTask.class);
    }
}
