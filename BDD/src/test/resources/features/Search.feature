Feature: Title of your feature
  I want to use this template for my feature file

  
  Scenario: Searching for items
  	Given I open the My Store page
		When I type the "dress" on search field
		And I click on Search button
		Then I see the page redirected to the search result page
		And I see the "dress" contained
		
  Scenario: Select the Searched items
  	Given I open the My Store page
		When I type the "dress" on search field
		And I click on Search button
		And I select the "Printed Chiffon Dress" product
		Then I see the "Printed Chiffon Dress" product page
