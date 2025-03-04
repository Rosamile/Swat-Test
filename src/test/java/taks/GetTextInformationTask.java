package taks;

import lombok.AllArgsConstructor;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static constans.Constans.TITLE_CHECKOUT_PAGE;



@AllArgsConstructor
public class GetTextInformationTask implements Task {

    @Override
    @Step("{0}the user should see the {string} page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( GetTextInformationTask.getTittle(TITLE_CHECKOUT_PAGE)

        );
    }

    public static GetTextInformationTask getTittle(String title) {
        return Tasks.instrumented(GetTextInformationTask.class);
    }
}
