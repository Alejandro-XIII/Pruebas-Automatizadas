# Authors:
# - Diego Alejandro Castañeda Ossa
# - Jose Carlos Ortiz Padilla
# - Weimar Darío Quintero Calle

Feature: Delete flight
  As an airline administrator, I need the option to delete the flight
  from the detailed view of the flight in order to erase all its information
  and stop selling reservations for that flight.

  Scenario: Flight deletion successful
    Given the user is logged in with the role of airline administrator
    When Selects the option to delete the flight
    Then The system displays a message to the user indicating successful deletion