package Definitions;

import PageObject.LoginPage;
import io.cucumber.java.en.*;

public class loginDefinition {
    LoginPage login;

    public loginDefinition() {
        login=new LoginPage(Hooks.driver);
    }

    @Given("que estoy en la web de StatusCheckup")
    public void que_estoy_en_la_web_de_status_checkup() {
        Hooks.driver.get("https://statuscheckup.com/login?next=/dashboard");

    }
    @When("ingreso correo {string}")
    public void ingresoCorreo(String correo) {
        login.IngresarUsuario(correo);
    }
    @And("ingreso contraseña {string}")
    public void ingresoContraseña(String texto) {
        login.IngresarPassword(texto);
    }
    @Then("puedo ingresar al portal de monitoreo")
    public void puedo_ingresar_al_portal_de_monitoreo() {
        login.ClickIngresar();
    }

    @And("valido el correo de logeo {string}")
    public void validoElCorreoDeLogeo(String texto) {
        login.ValidarTexto(texto);
    }

    @When("ingreso correo invalido {string}")
    public void ingresoCorreoInvalido(String correo) {
        login.IngresarUsuario(correo);
    }

    @Then("valido el mensaje de correo errado {string}")
    public void validoElMensajeDeCorreoErrado(String mensaje) {
        login.ClickIngresar();
        login.ValidarMensajeError(mensaje);
    }

    @Then("valido el mensaje de password errado {string}")
    public void validoElMensajeDePasswordErrado(String mensaje) {
        login.ClickIngresar();
        login.ValidarMensajeError(mensaje);
    }


}
