package question;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static userInterface.ProductsPageUserInterface.SHOPPING_CART_BUTTON;


public class AddToCartSuccessfull implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return !SHOPPING_CART_BUTTON.resolveAllFor(actor).isEmpty();

    }
    public static AddToCartSuccessfull complete() {
        return new AddToCartSuccessfull();
    }
}
