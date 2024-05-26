package co.com.udea.certificacion.gestion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.Random;

import static co.com.udea.certificacion.gestion.userinterfaces.HomePage.*;

public class FillOutForm implements Interaction {
    Random random = new Random();

    @Override
    public <T extends Actor> void performAs(T actor) {
        String vuelo = "SA-"+ (random.nextInt(9000) + 1000);
        actor.attemptsTo(Enter.theValue(vuelo).into(TEXT_N_VUELO));
        actor.attemptsTo(Click.on(VUELO_INTERNACIONAL_INPUT));
        actor.attemptsTo(Click.on(VUELO_NACIONAL_INPUT));
        actor.attemptsTo(Click.on(ORIGEN_SELECT));
        actor.attemptsTo(Click.on(BOG_OPTION));
        actor.attemptsTo(Click.on(DESTINO_SELECT));
        actor.attemptsTo(Click.on(MED_OPTION));
        actor.attemptsTo(Enter.theValue("28052024").into(TEXT_FECHA_SALIDA));
        actor.attemptsTo(Enter.theValue("28052024").into(TEXT_FECHA_LLEGADA));
        actor.attemptsTo(Enter.theValue("1130a").into(TEXT_HORA_SALIDA));
        actor.attemptsTo(Enter.theValue("1230p").into(TEXT_HORA_LLEGADA));
        actor.attemptsTo(Enter.theValue("avion").into(TEXT_TIPO_AERONAVE));
        actor.attemptsTo(Enter.theValue("30").into(TEXT_CANTIDAD_PASAJEROS));
        actor.attemptsTo(Enter.theValue("120000").into(TEXT_PRECIO_TICKET));
        actor.attemptsTo(Enter.theValue("5").into(TEXT_IMPUESTOS));
        actor.attemptsTo(Enter.theValue("5").into(TEXT_SOBRETASA)
                .thenHit(Keys.RETURN));
    }

    public static FillOutForm inForm(){
        return Tasks.instrumented(FillOutForm.class);
    }
}