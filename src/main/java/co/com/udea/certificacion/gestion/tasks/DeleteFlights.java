package co.com.udea.certificacion.gestion.tasks;

import co.com.udea.certificacion.gestion.interactions.ClickDeleteFlights;
import co.com.udea.certificacion.gestion.interactions.ClickOpenFlights;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class DeleteFlights implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickOpenFlights.inButton());
        actor.attemptsTo(ClickDeleteFlights.inButton());
    }

    public static DeleteFlights delete(){
        return Tasks.instrumented(DeleteFlights.class);
    }
}
