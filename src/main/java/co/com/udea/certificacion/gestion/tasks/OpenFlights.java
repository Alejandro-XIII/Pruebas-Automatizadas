package co.com.udea.certificacion.gestion.tasks;

import co.com.udea.certificacion.gestion.interactions.ClickDeleteFlights;
import co.com.udea.certificacion.gestion.interactions.ClickOpenFlights;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class OpenFlights implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickOpenFlights.inButton());
    }

    public static OpenFlights open(){
        return Tasks.instrumented(OpenFlights.class);
    }
}
