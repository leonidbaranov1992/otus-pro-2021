@FirstScenario
@UI
Feature: First feature to test

  Scenario Outline: First Scenario
    Given User open <Page> page
    Then Click to 'Курсы'
      | 'Курсы'             |
      | 'Преподавательская' |
      | 'QA'                |
    And Open Тестирование
    And Open Java QA Engineer. Basic
    And Redirect to Java QA Engineer. Basic

    Examples:
      | Page     |
      | OtusPage |
      | MainPage |

