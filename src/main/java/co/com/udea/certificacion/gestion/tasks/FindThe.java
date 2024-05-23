package co.com.udea.certificacion.gestion.tasks;

import co.com.udea.certificacion.gestion.interactions.wordToSearch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FindThe implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(wordToSearch.inTextArea());
    }

    public static FindThe wordKey(){
        return Tasks.instrumented(FindThe.class);
    }
}
