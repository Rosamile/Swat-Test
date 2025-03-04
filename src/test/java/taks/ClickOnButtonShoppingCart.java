package taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userInterface.ProductsPageUserInterface.SHOPPING_CART_BUTTON;

public class ClickOnButtonShoppingCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SHOPPING_CART_BUTTON));

    }
    public static ClickOnButtonShoppingCart clickOnButtonTasK() {
        return Tasks.instrumented(ClickOnButtonShoppingCart.class);
    }
}
