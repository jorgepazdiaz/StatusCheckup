package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class homePage {
    private WebDriver driver;
    private WebDriverWait wait;

    protected static String webBusqueda;
    public homePage(WebDriver d) {
        driver=d;
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);

    }

    public void selectProduct(String url) {
        String path="//h2[contains(text(),'"+url+"')]";
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
        //WebElement productElement = driver.findElement(By.xpath(path));
        Assert.assertEquals(url,element.getText());
        webBusqueda=element.getText();
        element.click();
    }
}
