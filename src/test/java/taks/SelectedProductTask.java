package taks;


import lombok.AllArgsConstructor;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static userInterface.ProductsPageUserInterface.*;


@AllArgsConstructor
public class SelectedProductTask implements Task {


    private List<String> products;

    @Override
    @Step("{0} agrega el producto {1} al carrito")

    public <T extends Actor> void performAs(T actor) {
        for (String product : products) {
            actor.attemptsTo(
                    Click.on(SHOPPING_CART_BUTTON)
            );

        }
    }

    public static SelectedProductTask selectProducts(List<String> products) {
        return Tasks.instrumented(SelectedProductTask.class, products);
    }
}




