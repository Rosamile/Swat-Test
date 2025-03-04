package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import question.DeleteProductSuccesfull;
import taks.*;

import static constans.Constans.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;


public class CartStepDefinitions {

    @When("the user enters the cart using the cart button")
    public void theUserEntersTheCartUsingTheCartButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ClickOnButtonShoppingCart.clickOnButtonTasK()
        );


    }

    @And("the user removes the first product from the cart")
    public void theUserRemovesTheFirstProductFromTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(RemoveRandomProductTask.removeOneProduct(PRODUCT_DELETE));
    }

    @Then("the product should not be visible in the cart")
    public void theProductShouldNotBeVisibleInTheCart() {
        OnStage.theActorInTheSpotlight().should(seeThat(DeleteProductSuccesfull.deleteProductSuccesfull(),is (true)));
    }

    @And("the user clicks the checkout button")
    public void theUserClicksTheCheckoutButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(CheckOutTask.checkOutTask());

    }



}
