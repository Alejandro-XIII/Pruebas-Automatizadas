#author:
  #information

Feature: crear un vuelo directo

  Scenario: carga de formulario exitosa
    Given el usuario tenga sesion iniciada con rol de administrador de la aerolinea
    When elige la opcion de nuevo vuelo directo
    Then se carga el formulario de ingreso de datos basicos de un vuelo directo