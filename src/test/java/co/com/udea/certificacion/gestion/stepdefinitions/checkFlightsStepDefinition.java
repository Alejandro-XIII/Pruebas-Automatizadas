package co.com.udea.certificacion.gestion.stepdefinitions;

import co.com.udea.certificacion.gestion.questions.ValidationAdminSession;
import co.com.udea.certificacion.gestion.tasks.OpenThe;
import co.com.udea.certificacion.gestion.userinterfaces.HomePage;
import co.com.udea.certificacion.gestion.utils.Constants2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;




public class checkFlightsStepDefinition {
    @Given("The user is logged in with the role of airline administrator")
    public void theUserIsLogged() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("selects the option to view all flights")
    public void selectsTheOptionToViewAllFlights() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("The table is loaded with all the created flights and their basic data")
    public void theTableIsLoadedWithAllTheCreatedFlightsAndTheirBasicData() {
        // Write code here that turns the phrase above into concrete actions
    }
}
