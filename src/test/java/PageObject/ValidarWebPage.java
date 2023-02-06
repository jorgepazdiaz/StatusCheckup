package PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ValidarWebPage {
    private WebDriver driver;
    private WebDriverWait wait;
    public ValidarWebPage(WebDriver d) {
        driver=d;
        wait= new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//button[contains(text(),'Back')]") private WebElement titulo;

    public void validarTitulo(){
        wait.until(ExpectedConditions.visibilityOf(titulo));
        titulo.isDisplayed();
        System.out.println(titulo.getText());
    }
}
