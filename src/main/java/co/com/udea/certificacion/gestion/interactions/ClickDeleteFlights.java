package co.com.udea.certificacion.gestion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.certificacion.gestion.userinterfaces.HomePage.*;

public class ClickDeleteFlights implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ELIMINAR_VUELO));
    }

    public static ClickDeleteFlights inButton(){
        return Tasks.instrumented(ClickDeleteFlights.class);
    }
}
