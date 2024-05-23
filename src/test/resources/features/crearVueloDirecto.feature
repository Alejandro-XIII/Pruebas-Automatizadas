#author:
  #information

Feature: crear un vuelo directo.
  Como un usuario administrador de la aerolinea necesito cargar un formulario que me
  solicite los datos obligatorios de un vuelo con la finalidad de crear un vuelo directo
  para vender reservas.

  Scenario: carga de formulario exitosa
    Given el usuario tenga sesion iniciada con rol de administrador de la aerolinea
    When elige la opcion de nuevo vuelo directo
    Then se carga el formulario de ingreso de datos basicos de un vuelo directo