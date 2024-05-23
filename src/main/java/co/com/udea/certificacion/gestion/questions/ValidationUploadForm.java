package co.com.udea.certificacion.gestion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.certificacion.gestion.userinterfaces.HomePage.FORM;

public class ValidationUploadForm implements Question<String> {
    public ValidationUploadForm(){}
    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(FORM).getText();
        return msg;
    }

    public static ValidationUploadForm validarFormulario(){
        return new ValidationUploadForm();
    }
}
