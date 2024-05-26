package co.com.udea.certificacion.gestion.stepdefinitions;

import co.com.udea.certificacion.gestion.questions.ValidationAdminSession;
import co.com.udea.certificacion.gestion.tasks.DeleteFlights;
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

public class deleteFlightStepDefinition {
    private final Actor admin = Actor.named("Paula");

    @Managed(driver="chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Before
    public void init(){
        admin.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
    }

    @Given("the user is logged in with the role of airline administrator")
    public void theUserIsLoggedInWithTheRoleOfAirlineAdministrator() {
        //inicia la página
        admin.attemptsTo(OpenThe.browser(new HomePage()));
        //Verifica que se vea el nombre del admin
        GivenWhenThen.givenThat(admin).should(GivenWhenThen.seeThat(ValidationAdminSession.
                validarAdmin(), Matchers.containsString(Constants2.ADMIN_NAME)));
    }
    @When("Selects the option to delete the flight")
    public void selectsTheOptionToDeleteTheFlight() {
        // Seleccionar ver vuelos y eliminar un vuelo
        admin.attemptsTo(DeleteFlights.delete());
    }
    @Then("The system displays a message to the user indicating successful deletion")
    public void theSystemDisplaysAMessageToTheUserIndicatingSuccessfulDeletion() {
        //TODO Valida eliminación del vuelo
    }

}
