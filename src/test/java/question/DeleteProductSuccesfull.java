package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static constans.Constans.PRODUCT_DELETE;
import static userInterface.ProductsPageUserInterface.LIST_PRODUCTS_IN_THE_CART;

public class DeleteProductSuccesfull implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

            String listProducts = Text.of(LIST_PRODUCTS_IN_THE_CART).answeredBy(actor);

            return !listProducts.contains(PRODUCT_DELETE);
        }
    public static DeleteProductSuccesfull deleteProductSuccesfull() {
        return new DeleteProductSuccesfull();
    }

}


