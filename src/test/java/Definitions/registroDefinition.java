package Definitions;

import PageObject.RegistroPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class registroDefinition {
    RegistroPage registro;

    public registroDefinition() {
        registro= new RegistroPage(Hooks.driver);
    }

    @Given("Ingresar a la pagina StatusCheckup")
    public void ingresarALaPaginaStatusCheckup() {
        Hooks.driver.get("https://statuscheckup.com");
    }


    @When("doy click en el boton sign up")
    public void doyClickEnElBotonSignUp() {
        registro.ClickCrearRegistro();
    }
}
