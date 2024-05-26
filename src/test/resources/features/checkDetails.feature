# Authors:
# - Diego Alejandro Castañeda Ossa
# - Jose Carlos Ortiz Padilla
# - Weimar Darío Quintero Calle

Feature: Check Flight Details.
  As an airline administrator, I need there to be a view details
  option for each flight so that it redirects me to a page to view
  all the information of the selected flight.

  Scenario: Flight Details Visualization.
    Given The user is logged in with the role of airline admin.
    When Selects the option for details of one of the created flights.
    Then A page is loaded displaying all the information of the selected flight.