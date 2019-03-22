Feature: Title of your feature
  I want to use this template for my feature file

  
  Scenario: Add items into the shopping cart
  	Given I open the My Store page
		When I click on "Women" tab
		And I select "Faded Short Sleeve T-shirts" 
		And I set Quantity "2"
		Then I see the Quantity set to "2"
		When I set Size "M"
		Then I see the Size set to "M"
		When I Add to cart
		And I click on Cart
		Then I see the added items
			|Description								|Unit price	|Qty|Total	|
			|Faded Short Sleeve T-shirts|$16.51			|1	|$16.51	|
		When I click on delete button
		Then I can see the cart is empty
		
		

