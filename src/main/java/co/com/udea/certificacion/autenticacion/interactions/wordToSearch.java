package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.udea.certificacion.autenticacion.userinterfaces.HomePage.*;

public class wordToSearch implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("SA-7986").into(INPUT_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Click.on(CLICK_BOTON_CREAR));
    }

    public static wordToSearch inTextArea(){
        return Tasks.instrumented(wordToSearch.class);
    }
}