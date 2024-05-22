package co.com.udea.certificacion.autenticacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

    public static final Target INPUT_TEXT = Target.the("texto de entrada").locatedBy("//*[@name='vuelo']");
    public static final  Target CLICK_BOTON_CREAR =Target.the("botón para crear vuelo").locatedBy("//*[@type=\"submit\"]");
    public static final  Target MENSAJE_ERROR =Target.the("Mensaje de error").locatedBy("//*[@ class='bg-red-800 mb-3 p-3 rounded-md font-bold text-center text-white uppercase']");




}