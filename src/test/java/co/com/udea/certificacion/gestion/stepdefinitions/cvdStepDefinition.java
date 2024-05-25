package co.com.udea.certificacion.gestion.stepdefinitions;

import co.com.udea.certificacion.gestion.questions.ValidationAdminSession;
import co.com.udea.certificacion.gestion.questions.ValidationMessage;
import co.com.udea.certificacion.gestion.questions.ValidationUploadForm;
import co.com.udea.certificacion.gestion.tasks.FillOut;
import co.com.udea.certificacion.gestion.tasks.OpenThe;
import co.com.udea.certificacion.gestion.tasks.SearchAndClick;
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

public class cvdStepDefinition {
    private final Actor admin = Actor.named("Paula");

    @Managed(driver="chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Before
    public void init(){
        admin.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
    }

    @Given("el usuario tenga sesion iniciada con rol de administrador de la aerolinea")
    public void elUsuarioConRolAdmin() {
        //inicia la página
        admin.attemptsTo(OpenThe.browser(new HomePage()));
        //Verifica que se vea el nombre del admin
        GivenWhenThen.givenThat(admin).should(GivenWhenThen.seeThat(ValidationAdminSession.
                validarAdmin(), Matchers.containsString(Constants2.ADMIN_NAME)));
    }

    @When("elige la opcion de nuevo vuelo directo")
    public void nuevoVueloDirecto() {
        //Inicia por defecto a nuevo vuelo, por lo que cambia de página primero
        //para validar el botón de crear nuevo vuelo
        admin.attemptsTo(SearchAndClick.wordKey());
    }

    @Then("se carga el formulario de ingreso de datos basicos de un vuelo directo")
    public void cargaFormularioVueloDirecto() {
        //Valida que se cargó el formulario con su titulo
        GivenWhenThen.then(admin).should(GivenWhenThen.seeThat(ValidationUploadForm
                .validarFormulario(), Matchers.containsString(Constants2.TITLE_FORM)));
    }

    @Given("el formulario  de ingreso de datos basicos de un nuevo vuelo directo esta cargado")
    public void formularioVueloDirectoCargado() {
        //Valida que se cargó el formulario con su titulo
        GivenWhenThen.givenThat(admin).should(GivenWhenThen.seeThat(ValidationUploadForm
                .validarFormulario(), Matchers.containsString(Constants2.TITLE_FORM)));
    }
    @When("Ingresa todos los datos del vuelo")
    public void ingresarDatosVuelo() {
        //Llena todos los datos del formulario y le da enter
        admin.attemptsTo(FillOut.form());
    }
    @Then("el sistema valida los campos y muestra mensaje al usuario")
    public void validarCampos() {
        //Valida el mensaje de vuelo creado exitosamente
        GivenWhenThen.then(admin).should(GivenWhenThen.seeThat(ValidationMessage
                .validarMensaje(), Matchers.containsString(Constants2.VUELO_CREADO)));
    }
}