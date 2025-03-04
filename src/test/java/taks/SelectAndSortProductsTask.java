package taks;

import lombok.AllArgsConstructor;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userInterface.ProductsPageUserInterface.*;


@AllArgsConstructor
public class SelectAndSortProductsTask implements Task {

    @Override
    @Step("the user selects the order of products")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SORT_DROPDOWN),
                Click.on(PRODUCT_ADD1),
                Click.on(PRODUCT_ADD2),
                Click.on(PRODUCT_ADD3)


        );
    }

    public static SelectAndSortProductsTask execute() {
        return Tasks.instrumented(SelectAndSortProductsTask.class);
    }

}
