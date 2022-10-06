package Steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.LoginBotonEnviarTask;
import task.LoginDatosTask;
import task.LoginTask;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSteps {
    @Before
    public void definirEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^Dirigirse a la URL$")
    public void DirigirsealaURL() {
        theActor("Javier").wasAbleTo(LoginTask.loginTask());
    }

    @When("^el usuario ingresa (.*) y (.*)$")
    public void elusuarioingresausuarioycontrasena(String usuario,String contrasena) {
        theActorInTheSpotlight().attemptsTo(
                LoginDatosTask.Datos(usuario,contrasena)
        );

    }

    @Then("^Usuario da click en el boton Enviar$")
    public void UsuariodaclickenelbotonEnviar() {
        theActorInTheSpotlight().attemptsTo(LoginBotonEnviarTask.Enviar());
    }


}
