package stepDefinitions.hooks;

import hook.OpenBrowser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebDriver;




public class Hook {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void tearDown() {
        WebDriver driver = ThucydidesWebDriverSupport.getDriver();
        if (driver != null) {
            driver.quit();
        }
    }
}
