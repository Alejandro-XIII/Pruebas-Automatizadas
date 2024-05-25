#author:
  #information

Feature: Check Flight Details
  As an airline administrator, I need there to be a "view details"
  option for each flight so that it redirects me to a page to view
  all the information of the selected flight.

  Scenario: Flight Details Visualization
    Given The user is logged in with the role of airline administrator, selects the option to view all flights, the table is loaded with all the created flights, their basic data, and the option to view details
    When Selects the option for details of one of the created flights
    Then A page is loaded displaying all the information of the selected flight