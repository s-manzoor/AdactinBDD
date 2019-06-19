Feature: Hotel Selection

  Scenario: Searched Hotel selection
    Given User is on Select Hotel page
    When Select a hotel
    Then Booking confirmation page is displayed