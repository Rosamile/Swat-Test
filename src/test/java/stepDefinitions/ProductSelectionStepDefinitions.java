package stepDefinitions;

import io.cucumber.java.en.And;

import static org.hamcrest.Matchers.is;
import net.serenitybdd.screenplay.actors.OnStage;
import question.AddToCartSuccessfull;
import taks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ProductSelectionStepDefinitions {


    @And("the user selects the order of products")
    public void theySortTheProductsBy() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectAndSortProductsTask.execute());
    }


    @And("the user selects the  randoms product")
    public void theUserSelectsTheRandomsProduct() {
        OnStage.theActorInTheSpotlight().should(seeThat(AddToCartSuccessfull.complete(),is (true)));
    }
}
