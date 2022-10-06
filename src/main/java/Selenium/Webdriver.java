package Selenium;

import com.google.common.base.Predicate;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public abstract class Webdriver extends net.serenitybdd.core.pages.PageObject{
    protected Webdriver() {
        super();
    }

    protected Webdriver(WebDriver driver, Predicate<? super PageObject> callback) {
        super(driver, callback);
    }

    public Webdriver(WebDriver driver, int ajaxTimeout) {
        super(driver, ajaxTimeout);
    }

    public Webdriver(WebDriver driver) {
        super(driver);
    }

}
