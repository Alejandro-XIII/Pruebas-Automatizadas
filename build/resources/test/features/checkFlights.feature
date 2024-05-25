#author:
  #information

Feature: Check all flights.
  As an airline administrator user I need a table that lists
  all the created and saved flights in order to consult the
  basic data of each flight.

  Scenario: Successful flight table visualization
    Given The user is logged in with the role of airline administrator
    When selects the option to view all flights
    Then The table is loaded with all the created flights and their basic data