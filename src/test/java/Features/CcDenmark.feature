@All
Feature: Test user journey in Denmark site

  @CCPage
  Scenario: Credit Cards happy path

    Given I land on 'Compare Denmark' site
    Then I click on 'Find more' button
    And I click on 'Find a credit card' button
    Then I should see 'Results Page'


  @CCPage
  Scenario Outline: CC Page section validation

    Given I land on 'Compare Denmark' site
    Then I validate that <Sections> are displayed
    And I validate that <Titles> are displayed

    Examples:
      | Sections        | Titles               |
      | ProductShowcase | ProductShowcaseTitle |


  @CCPage @CCResults
  Scenario Outline:  Credit cards Results page

    Given I land on 'Results page'
    Then I randomly pick a 'Credit Card'
    And I click on 'more info'
    And I should see the <sections>

    Examples:
      | sections   |
      | Værdatvide |







