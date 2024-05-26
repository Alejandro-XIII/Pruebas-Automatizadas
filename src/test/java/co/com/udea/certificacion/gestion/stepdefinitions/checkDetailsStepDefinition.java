package co.com.udea.certificacion.gestion.stepdefinitions;

import co.com.udea.certificacion.gestion.questions.ValidationAdminSession;
import co.com.udea.certificacion.gestion.questions.ValidationUploadForm;
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

public class checkDetailsStepDefinition {
    private final Actor admin = Actor.named("Paula");

    @Managed(driver="chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Before
    public void init(){
        admin.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
    }

    @Given("The user is logged in with the role of airline admin.")
    public void loggedAdministrator() {
        //inicia la página
        admin.attemptsTo(OpenThe.browser(new HomePage()));
        //Verifica que se vea el nombre del admin
        GivenWhenThen.givenThat(admin).should(GivenWhenThen.seeThat(ValidationAdminSession.
                validarAdmin(), Matchers.containsString(Constants2.ADMIN_NAME)));
    }
    @When("Selects the option for details of one of the created flights.")
    public void selectsTheOptionForDetailsOfOneOfTheCreatedFlights() {
        // Seleccionar ver vuelos
        admin.attemptsTo(OpenFlights.open());
        //TODO no hay maneraa de probar el "Ver mas"
    }
    @Then("A page is loaded displaying all the information of the selected flight.")
    public void aPageIsLoadedDisplayingAllTheInformationOfTheSelectedFlight() {
        //TODO no hay funcionalidad
    }
}
