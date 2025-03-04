package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import question.FinishBuySuccerfull;
import taks.*;


import static constans.Constans.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static userInterface.CheckOutOverViewUserInterface.*;



public class CheckoutStepDefinitions {

    @When("the user enters their information {string}, {string} and {string} and clicks the continue button")
    public void theUserEntersTheirInformationAndAndClicksTheContinueButton(String firstName, String lastName, String postalCode) {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                CheckOutInformationTask.fillCheckoutForm(firstName,lastName,postalCode)

        );
    }

    @And("the user clicks the FINISH button")
    public void theUserClicksTheFINISHButton() {
        OnStage.theActorCalled(ACTOR).attemptsTo(FinishButton.finishButton());

    }

    @Then("the user should see the confirmation message")
    public void theUserShouldSeeTheConfirmationMessage() {
        OnStage.theActorCalled(ACTOR).should(seeThat(FinishBuySuccerfull.successfulMessage(), containsString(FINAL_MESSAGE)));
    }



}

