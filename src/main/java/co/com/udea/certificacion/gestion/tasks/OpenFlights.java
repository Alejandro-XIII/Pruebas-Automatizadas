package co.com.udea.certificacion.gestion.tasks;

import co.com.udea.certificacion.gestion.interactions.DeleteFlight;
import co.com.udea.certificacion.gestion.interactions.OpenNewFlight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class OpenFlights implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(DeleteFlight.inButton());
    }

    public static OpenFlights delete(){
        return Tasks.instrumented(OpenFlights.class);
    }
}
