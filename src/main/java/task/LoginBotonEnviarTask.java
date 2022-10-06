package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static Selenium.objetos.BOTON_ENVIAR;

public class LoginBotonEnviarTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ENVIAR)
        );
    }

    public static LoginBotonEnviarTask Enviar() {
        return Tasks.instrumented(LoginBotonEnviarTask.class);
    }



}
