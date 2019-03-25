Feature: Title of your feature
  I want to use this template for my feature file

  
  Scenario: Add items into the shopping cart
  	Given I open the My Store page
		When I click on "Women" tab
		And I select the "Faded Short Sleeve T-shirts" product 
		And I set Quantity number to "2"
		Then I see the Quantity number is "2"
		When I set Size to "M"
		Then I see the selecte Size is "M"
		When I click on Add to cart button
		And I click on continue shopping
		And I click on shopping cart
		Then I see the added items
			|Description								|Unit price	|Qty|Total	|
			|Faded Short Sleeve T-shirts|$16.51			|1	|$16.51	|
		When I click on delete button
		Then I can see the cart is empty
		
		

