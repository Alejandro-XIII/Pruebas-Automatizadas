package co.com.udea.certificacion.gestion.tasks;

import co.com.udea.certificacion.gestion.interactions.CreateNewFlight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SearchAndClick implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CreateNewFlight.inButton());
    }

    public static SearchAndClick wordKey(){
        return Tasks.instrumented(SearchAndClick.class);
    }
}
