package PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver d) {
        driver=d;
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "usernameOrEmail") private WebElement usuario;
    @FindBy(name = "password") private WebElement contrasena;
    @FindBy(xpath = "//button[@type='submit']") private WebElement ingresar;
    @FindBy(xpath = "//div[@class='css-16qv2i2']")private WebElement correoIngreso;
    @FindBy(xpath = "//p[@class='css-1187uh4']")private WebElement mensajeError;

    public void IngresarUsuario(String correo){
        wait.until(ExpectedConditions.visibilityOf(usuario));
        usuario.sendKeys(correo);
    }

    public void IngresarPassword(String texto){
        wait.until(ExpectedConditions.visibilityOf(contrasena));
        contrasena.sendKeys(texto);
    }

    public void ClickIngresar(){
        wait.until(ExpectedConditions.visibilityOf(ingresar));
        ingresar.click();
    }

    public void ValidarTexto(String texto){
        wait.until(ExpectedConditions.visibilityOf(correoIngreso));
        Assert.assertEquals(texto,correoIngreso.getText());
        System.out.println(correoIngreso.getText());
    }

    public void ValidarMensajeError(String texto){
        wait.until(ExpectedConditions.visibilityOf(mensajeError));
        Assert.assertEquals(texto,mensajeError.getText());
        System.out.println(mensajeError.getText());

    }
}
