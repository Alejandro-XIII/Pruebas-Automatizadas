package co.com.udea.certificacion.gestion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.certificacion.gestion.userinterfaces.HomePage.*;

public class DeleteFlight implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(VIEW_FLIGHT_BUTTON));
        actor.attemptsTo(Click.on(ELIMINAR_VUELO));
    }

    public static DeleteFlight inButton(){
        return Tasks.instrumented(DeleteFlight.class);
    }
}
