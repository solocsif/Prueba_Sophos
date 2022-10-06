package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static Selenium.objetos.CAMPO_PASSWORD;
import static Selenium.objetos.CAMPO_USUARIO;

public class LoginDatosTask implements Task {

    private String usuario;
    private String contrasena;

    public LoginDatosTask(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_USUARIO),
                Enter.theValue(usuario).into(CAMPO_USUARIO),
                Click.on(CAMPO_PASSWORD),
                Enter.theValue(contrasena).into(CAMPO_PASSWORD)
        );
    }

    public static LoginDatosTask Datos(String usuario, String contrasena) {
        return Tasks.instrumented(LoginDatosTask.class,usuario,contrasena);
    }
}
