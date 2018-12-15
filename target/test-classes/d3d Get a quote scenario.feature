@pb
Feature:D3D Security – To Verify “Get a quote”

  Background:
    Given I entered URL "https://www.d3dsecurity.co.uk"
    When I click on Online Demo

  Scenario:
    Given I entered first name as "Prabha"
    And I entered last name as "Barani"
    And I entered email as "prabhag82@gmail.com"
    And I entered phone number as "12345678"
    And I entered subject as "Hello"
    And I entered message as "Please let us know the cost of cctv camera’s"
    And I entered the Captcha Code "JT5D"
    When I click on button Send message
    Then I should see the message as "Thanks For Inquiry, We will Contact you Soon !!"
