package co.com.udea.certificacion.gestion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

    //Ingresar
    public static final Target TEXT_N_VUELO = Target.the("texto de número del vuelo")
            .locatedBy("//*[@name='vuelo']");
    public static final Target TEXT_FECHA_SALIDA = Target.the("texto de fecha de salida")
            .locatedBy("//*[@name='fechaSalida']");
    public static final Target TEXT_FECHA_LLEGADA = Target.the("texto de fecha de llegada")
            .locatedBy("//*[@name='fechaLlegada']");
    public static final Target TEXT_HORA_SALIDA = Target.the("texto de hora de salida")
            .locatedBy("//*[@name='horaSalida']");
    public static final Target TEXT_HORA_LLEGADA = Target.the("texto de hora de llegada")
            .locatedBy("//*[@name='horaLlegada']");
    public static final Target TEXT_TIPO_AERONAVE = Target.the("texto de tipo de aeronave")
            .locatedBy("//*[@name='tipoAeronave']");
    public static final Target TEXT_CANTIDAD_PASAJEROS = Target.the("texto de cantidad de pasajeros")
            .locatedBy("//*[@name='cantidadPasajeros']");
    public static final Target TEXT_PRECIO_TICKET = Target.the("texto de precio del ticket")
            .locatedBy("//*[@name='precioTicket']");
    public static final Target TEXT_IMPUESTOS = Target.the("texto de impuestos")
            .locatedBy("//*[@name='impuestos']");
    public static final Target TEXT_SOBRETASA = Target.the("texto de sobretasa")
            .locatedBy("//*[@name='sobretasa']");
    //Clicks
    public static final  Target CREATE_NEW_FLIGHT_BUTTON =Target.the("botón para abrir el formulario")
            .locatedBy("//*[@href='/gestion_vuelosB']");
    public static final  Target VIEW_FLIGHT_BUTTON =Target.the("botón para ver los vuelos")
            .locatedBy("//*[@href='/gestion_vuelosB/see-flight']");
    public static final  Target VUELO_NACIONAL_INPUT =Target.the("input para vuelo nacional")
            .locatedBy("//*[@ value='National']");
    public static final  Target VUELO_INTERNACIONAL_INPUT =Target.the("input para vuelo internacional")
            .locatedBy("//*[@ value='International']");
    public static final  Target ORIGEN_SELECT =Target.the("Select de origen")
            .locatedBy("//*[@ name='origen']");
    public static final  Target BOG_OPTION =Target.the("Option de Bogotá")
            .locatedBy("//*[@ value='BOG']");
    public static final  Target DESTINO_SELECT =Target.the("Select de destino")
            .locatedBy("//*[@ name='destino']");
    public static final  Target MED_OPTION =Target.the("Option de Medellín")
            .locatedBy("//*[@ value='AEP']");
    public static final  Target ELIMINAR_VUELO =Target.the("botón para eliminar vuelo")
            .locatedBy("//*[@ class='text-red-500']");
    //Buscar
    public static final  Target USER_ADMIN =Target.the("Verifica usuario administrador")
            .locatedBy("//*[@ class = 'font-semibold text-xl']");
    public static final  Target FORM =Target.the("Verifica carga de formulario")
            .locatedBy("//*[@ class='font-bold text-3xl']");
    public static final  Target MENSAJE_VERDE =Target.the("Mensaje de vuelo creado")
            .locatedBy("//*[@ class='bg-green-800 mb-3 p-3 rounded-md font-bold text-center text-white uppercase']");
}