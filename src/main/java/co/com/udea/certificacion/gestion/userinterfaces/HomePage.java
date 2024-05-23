package co.com.udea.certificacion.gestion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

    public static final Target INPUT_TEXT = Target.the("texto de entrada")
            .locatedBy("//*[@name='vuelo']");
    //Botones View Flights Button
    public static final  Target CREATE_NEW_FLIGHT_BUTTON =Target.the("botón para abrir el formulario")
            .locatedBy("//*[@href='/gestion_vuelosB']");
    public static final  Target VIEW_FLIGHT_BUTTON =Target.the("botón para ver los vuelos")
            .locatedBy("//*[@href='/gestion_vuelosB/see-flight']");
    public static final  Target CLICK_BOTON_CREAR =Target.the("botón para crear vuelo")
            .locatedBy("//*[@type='submit']");
    //Buscar
    public static final  Target USER_ADMIN =Target.the("Verifica usuario administrador")
            .locatedBy("//*[@ class = 'font-semibold text-xl']");
    public static final  Target FORM =Target.the("Verifica carga de formulario")
            .locatedBy("//*[@ class='font-bold text-3xl']");
    public static final  Target MENSAJE_ERROR =Target.the("Mensaje de error")
            .locatedBy("//*[@ class='bg-red-800 mb-3 p-3 rounded-md font-bold text-center text-white uppercase']");

}