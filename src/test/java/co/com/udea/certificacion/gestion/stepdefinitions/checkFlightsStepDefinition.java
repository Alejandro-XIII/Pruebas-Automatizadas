package co.com.udea.certificacion.gestion.stepdefinitions;

import co.com.udea.certificacion.gestion.questions.ValidationAdminSession;
import co.com.udea.certificacion.gestion.questions.ValidationUploadForm;
import co.com.udea.certificacion.gestion.tasks.DeleteFlights;
import co.com.udea.certificacion.gestion.tasks.OpenFlights;
import co.com.udea.certificacion.gestion.tasks.OpenThe;
import co.com.udea.certificacion.gestion.userinterfaces.HomePage;
import co.com.udea.certificacion.gestion.utils.Constants2;
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


public class checkFlightsStepDefinition {
    private final Actor admin = Actor.named("Paula");

    @Managed(driver="chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Before
    public void init(){
        admin.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
    }

    @Given("The user is logged in with the role of airline administrator")
    public void theUserIsLogged() {
        //inicia la página
        admin.attemptsTo(OpenThe.browser(new HomePage()));
        //Verifica que se vea el nombre del admin
        GivenWhenThen.givenThat(admin).should(GivenWhenThen.seeThat(ValidationAdminSession.
                validarAdmin(), Matchers.containsString(Constants2.ADMIN_NAME)));
    }
    @When("selects the option to view all flights")
    public void selectsTheOptionToViewAllFlights() {
        // Seleccionar ver vuelos
        admin.attemptsTo(OpenFlights.open());
    }
    @Then("The table is loaded with all the created flights and their basic data")
    public void theTableIsLoadedWithAllTheCreatedFlightsAndTheirBasicData() {
        //Valida que se cargó la página de vuelos
        GivenWhenThen.givenThat(admin).should(GivenWhenThen.seeThat(ValidationUploadForm
                .validarFormulario(), Matchers.containsString(Constants2.VER_VUELOS)));
    }
}
