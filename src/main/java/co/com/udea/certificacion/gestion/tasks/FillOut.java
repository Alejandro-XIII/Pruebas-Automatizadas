package co.com.udea.certificacion.gestion.tasks;

import co.com.udea.certificacion.gestion.interactions.FillOutForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FillOut implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(FillOutForm.inForm());
    }

    public static FillOut form(){
        return Tasks.instrumented(FillOut.class);
    }
}
