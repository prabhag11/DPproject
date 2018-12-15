Feature:D3D Security – To Verify “Get a quote”


  Background:
    Given I entered URL "https://www.d3dsecurity.co.uk"
    When I click on Online Demo

  Scenario Outline: Validate Free Quote with Invalid data.

    Given I entered firstname as "<firstname>"
    And I entered lastname as "<lastname>"
    And I entered email as "<email_id>"
    And I entered phone number as "<number>"
    And I entered subject as "<Subject>"
    And I entered message as "<message>"
    And I entered the "<Captcha Code>"
    When I click the button Send message
    Then I should see "<ErrorMessage>"




    Examples:
      | firstname | lastname | email_id       | number    | Subject | message | Captcha Code | ErrorMessage                       |
      | Empty     | Barani   | test@gmail.com | 123456789 | Hi      | Hello   | Captcha code | Please fill in the required fields |
      | Prabha    | Barani   | test@gmail.com | empty     | Hi      | Hello   | Captcha code | Please fill in the required fields |
      | Prabha    | Barani   | test@gmail.com | 123456789 | Hi      | Hello   | empty        | Validation errors  occurred|
      | empty     | empty    | empty          | empty     | empty   | empty   | empty        | Validation errors  occurred|
