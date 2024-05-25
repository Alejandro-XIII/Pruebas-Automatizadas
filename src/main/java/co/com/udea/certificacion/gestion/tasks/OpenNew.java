package co.com.udea.certificacion.gestion.tasks;

import co.com.udea.certificacion.gestion.interactions.OpenNewFlight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class OpenNew implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(OpenNewFlight.inButton());
    }

    public static OpenNew wordKey(){
        return Tasks.instrumented(OpenNew.class);
    }
}
