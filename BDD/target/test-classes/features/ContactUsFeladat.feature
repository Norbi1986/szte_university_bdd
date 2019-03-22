Feature: Title of your feature
  I want to use this template for my feature file

  
  Scenario: Add items into the shopping cart
  	Given I open the My Store page
		When I click on "Contact us" tab
		Then I can see the contuct us page
		When I select Subject Heading "Customer Service" 
		And I give Email address "asada@sada.com"
		And I give Order reference "asdasd"
		And I give a Message "asdasdasdasdasdasd"
		Then I see my message is "asdasdaskdjla jdlas ldk alsd alsjdl ajdl lads"
