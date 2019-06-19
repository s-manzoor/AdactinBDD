Feature: Hotel Search

@SmokeTests
Scenario: Search Hotel
Given User is on Hotel Search page
When Provide hotel search criteria
And click Search button
Then Select Hotel page is displayed