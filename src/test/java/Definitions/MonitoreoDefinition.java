package Definitions;

import PageObject.LoginPage;
import PageObject.ValidarWebPage;
import PageObject.homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MonitoreoDefinition {
    LoginPage login;
    homePage home;
    ValidarWebPage web;

    public MonitoreoDefinition() {
        login=new LoginPage(Hooks.driver);
        home=new homePage(Hooks.driver);
        web=new ValidarWebPage(Hooks.driver);
    }
    @Given("ingreso al portal de monitoreo con {string} y password {string}")
    public void ingresoAlPortalDeMonitoreoConYPassword(String usuario, String contrasena) {
        Hooks.driver.get("https://statuscheckup.com/login?next=/dashboard");
        login.IngresarUsuario(usuario);
        login.IngresarPassword(contrasena);
        login.ClickIngresar();
    }

    @When("busco la url a monitorear {string}")
    public void buscoLaUrlAMonitorear(String url) {
        home.selectProduct(url);
    }

    @Then("puedo ver los datos de la pagina que busco")
    public void puedoVerLosDatosDeLaPaginaQueBusco() {
        web.validarTitulo();
    }
}
