# Authors:
# - Diego Alejandro Castañeda Ossa
# - Jose Carlos Ortiz Padilla
# - Weimar Darío Quintero Calle

Feature: Create a direct flight.
  As an airline administrator user, I need to load a form requesting the mandatory
  data for a flight in order to create a direct flight for selling reservations.

  Scenario: Form loading successful
    Given The user is logged in with the role of airline Administrator
    When Selects the option for a new direct flight
    Then The form for entering basic data of a direct flight is loaded

  Scenario: Form submission
    Given The form for entering basic data of a new direct flight is loaded
    When Enter all the flight details
    Then The system validates the fields and displays a message to the user