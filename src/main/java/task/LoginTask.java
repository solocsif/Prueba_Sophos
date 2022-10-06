package task;
import Selenium.objetos;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
public class LoginTask implements Task{

    private Selenium.objetos objetos;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(objetos)
        );

    }

    public static LoginTask loginTask() {
        return Tasks.instrumented(LoginTask.class);
    }
}
