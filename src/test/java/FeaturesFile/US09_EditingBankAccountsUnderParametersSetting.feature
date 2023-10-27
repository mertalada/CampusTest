Feature: Bank Accounts

  Scenario: Login with valid username and password
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    @Parameters @Finance @Banking @Smoke @Regression
  Scenario: Bank Account Setting
    And Click on the element in LocatorPage
        |Setup|
        |Parameters|
        |BankAccounts|

    And Click on the element in LocatorPage
        | addButton |

    And User sending the knowladge
        |Seda|11111111111|EUR|

    And Click on the element in LocatorPage
        |saveButton|
    Then Success massage should be displayed

    And Click on the element in LocatorPage
        |EditButton|

    And User sending the knowladge
        |Eda|

    And Click on the element in LocatorPage
        |saveButton|

    And Customer delete the element from LocatorPage
      | Seda|

    Then Success massage should be displayed

      @Parameters @GradeLevel @Education @Smoke @Regression
    Scenario: Grade Levels Setting
      And Click on the element in LocatorPage
        |Setup|
        |Parameters|
        |GradeLevel|

      And Click on the element in LocatorPage
        | addButton |

      And Create a User
        |Seda|Parça|1|

      And Click on the element in LocatorPage
        |saveButton|

      Then Success massage should be displayed

      And Click on the element in LocatorPage
        |EditButton|

      And User sending the knowladge
        |Eda|

      And Click on the element in LocatorPage
        |saveButton|

      And Customer delete the element from LocatorPage
        | Eda|

      Then Success massage should be displayed
