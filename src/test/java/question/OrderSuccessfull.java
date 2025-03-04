package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Arrays;
import java.util.List;

import static userInterface.ProductsPageUserInterface.*;
import static userInterface.ProductsPageUserInterface.PRODUCT_NAME_6;

public class OrderSuccessfull implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        String nameProduc1 = Text.of(PRODUCT_NAME_1).answeredBy(actor);
        String nameProduc2 = Text.of(PRODUCT_NAME_2).answeredBy(actor);
        String nameProduc3 = Text.of(PRODUCT_NAME_3).answeredBy(actor);
        String nameProduc4 = Text.of(PRODUCT_NAME_4).answeredBy(actor);
        String nameProduc5 = Text.of(PRODUCT_NAME_5).answeredBy(actor);
        String nameProduc6 = Text.of(PRODUCT_NAME_6).answeredBy(actor);

        List<String> expectedNameProducts = Arrays.asList(
                "Test.allTheThings() T-Shirt (Red)",
                "Sauce Labs Onesie",
                "Sauce Labs Fleece Jacket",
                "Sauce Labs Bolt T-Shirt",
                "Sauce Labs Bike Light",
                "Sauce Labs Backpack");

        List<String> actualNameOrderProducts = Arrays.asList(nameProduc1,nameProduc2,nameProduc3,nameProduc4,nameProduc5,nameProduc6);

        return!expectedNameProducts.equals(actualNameOrderProducts);
    }
}
