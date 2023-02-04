package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistroPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public RegistroPage(WebDriver d) {
        driver =d;
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='css-umg618']") private WebElement signup;

    public void ClickCrearRegistro(){
        wait.until(ExpectedConditions.elementToBeClickable(signup));
        signup.click();
    }
}
