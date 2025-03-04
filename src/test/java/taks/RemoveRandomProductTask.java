package taks;

import lombok.AllArgsConstructor;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userInterface.ProductsPageUserInterface.*;


@AllArgsConstructor
public class RemoveRandomProductTask implements Task {

    @Override
    @Step("the user removes the first product from the cart")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(REMOVE_TO_CART1)
        );

    }


    public static RemoveRandomProductTask removeOneProduct(String product) {
        return Tasks.instrumented(RemoveRandomProductTask.class);
    }
}

