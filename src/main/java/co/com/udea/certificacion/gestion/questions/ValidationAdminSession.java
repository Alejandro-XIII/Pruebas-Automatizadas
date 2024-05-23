package co.com.udea.certificacion.gestion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.certificacion.gestion.userinterfaces.HomePage.USER_ADMIN;

public class ValidationAdminSession implements Question<String> {

    public ValidationAdminSession(){}
    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(USER_ADMIN).getText();
        return msg;
    }

    public static ValidationAdminSession validarAdmin(){
        return new ValidationAdminSession();
    }
}