package stepDefinitions;


import hook.OpenBrowser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.actors.OnStage;
import question.LoginNoSucessFull;
import question.LoginSuccessful;
import taks.LoginTasK;

import static org.hamcrest.Matchers.containsString;


import static constans.Constans.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


@AllArgsConstructor
public class LoginPageStepDefinitions {

    @Given("The user enters their credentials {string} and {string}")
    public void theUserEntersTheirCredentialsAnd(String name, String password) {

        OnStage.theActorCalled(ACTOR)
                .attemptsTo(
                        OpenBrowser.openUrl(WEB_URL),
                        LoginTasK.clickOnButtonTasK(name, password)
                );
    }

    @Then("they should see an error message indicating invalid credentials")
    public void theyShouldSeeAnErrorMessageIndicatingInvalidCredentials() {
        OnStage.theActorCalled(ACTOR)
                .should(seeThat(LoginNoSucessFull.loginNoSucessFull(), containsString(MS_ERROR)));
    }



    @Then("they should see the products page")
    public void theyShouldSeeTheProductsPage() {
        OnStage.theActorInTheSpotlight().should(seeThat(LoginSuccessful.isDisplayed(), containsString(TITLE))
        );
    }



}
