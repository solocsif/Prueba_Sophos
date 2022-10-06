package Selenium;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
@DefaultUrl("https://tasks.evalartapp.com/automatization/")
public class objetos extends Webdriver {
    public static final Target CAMPO_USUARIO=Target.the("campo para ingresar Usuario").located(By.xpath("/html/body/div/div[2]/form/input[1]"));
    public static final Target CAMPO_PASSWORD=Target.the("campo para ingresar Password").located(By.xpath("/html/body/div/div[2]/form/input[2]"));
    public static final Target BOTON_ENVIAR=Target.the("campo para ingresar Password").located(By.xpath("/html/body/div/div[2]/form/input[2]"));
}
