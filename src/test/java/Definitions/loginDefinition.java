package Definitions;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import static Support.capturaPantalla.pantallazo;
import java.io.IOException;

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
    public void ingresoCorreo(String correo)throws IOException  {
        pantallazo();
        login.IngresarUsuario(correo);
        pantallazo();

    }
    @And("ingreso contraseña {string}")
    public void ingresoContraseña(String texto) throws IOException {
        login.IngresarPassword(texto);
        pantallazo();
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
    public void ingresoCorreoInvalido(String correo) throws IOException {
        login.IngresarUsuario(correo);
        pantallazo();
    }

    @Then("valido el mensaje de correo errado {string}")
    public void validoElMensajeDeCorreoErrado(String mensaje) throws IOException {
        login.ClickIngresar();
        login.ValidarMensajeError(mensaje);
        pantallazo();
    }

    @Then("valido el mensaje de password errado {string}")
    public void validoElMensajeDePasswordErrado(String mensaje) throws IOException {
        login.ClickIngresar();
        login.ValidarMensajeError(mensaje);
        pantallazo();
    }


}
