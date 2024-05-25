package co.com.udea.certificacion.gestion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.certificacion.gestion.userinterfaces.HomePage.MENSAJE_VERDE;

public class ValidationMessage implements Question<String> {

    public ValidationMessage(){}
    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(MENSAJE_VERDE).getText();
        return msg;
    }

    public static ValidationMessage validarMensaje(){
        return new ValidationMessage();
    }
}