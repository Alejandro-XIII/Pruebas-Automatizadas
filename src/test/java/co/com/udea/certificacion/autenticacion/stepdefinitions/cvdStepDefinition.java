package co.com.udea.certificacion.autenticacion.stepdefinitions;

import co.com.udea.certificacion.autenticacion.questions.ValidationHomePage;
import co.com.udea.certificacion.autenticacion.tasks.FindThe;
import co.com.udea.certificacion.autenticacion.tasks.OpenThe;
import co.com.udea.certificacion.autenticacion.userinterfaces.HomePage;
import co.com.udea.certificacion.autenticacion.utils.Constants2;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class cvdStepDefinition {
    private final Actor admin = Actor.named("Admin");

    @Managed(driver="chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Before
    public void init(){
        admin.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
    }

    @Given("el usuario tenga sesion iniciada con rol de administrador de la aerolinea")
    public void elUsuarioConRolAdmin() {
        admin.attemptsTo(OpenThe.browser(new HomePage()));
    }

    @When("elige la opcion de nuevo vuelo directo")
    public void nuevoVueloDirecto() {
        admin.attemptsTo(FindThe.wordKey());
    }

    @Then("se carga el formulario de ingreso de datos basicos de un vuelo directo")
    public void cargaFormularioVueloDirecto() {
        GivenWhenThen.then(admin).should(GivenWhenThen.seeThat(ValidationHomePage.titleUdeA(), Matchers.containsString(Constants2.VAL1)));
    }
}