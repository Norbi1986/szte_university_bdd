Feature: Title of your feature
  I want to use this template for my feature file

  @shop
  Scenario: Add items into the shopping cart
  	Given I open the My Store page
		When I click on "Women" tab
		And I select the "Printed Dress" product
		And I set Quantity number to "2"
		Then I see the Quantity number is "2"
		When I click on Add to cart button
		And I click on continue shopping
		When I click on "T-Shirts" tab
		And I select the "Faded Short Sleeve T-shirts" product
		And I set Quantity number to "3"
		Then I see the Quantity number is "3"
		When I click on Add to cart button
		And I click on continue shopping
		And I click on Proceed To Checkout
		Then I see the shopping cart page
		And I see the added items
			|Description								|Unit price	|Qty|Total	|
			|Printed Dress							|$50.99			|3	|$101.98|
			|Faded Short Sleeve T-shirts|$16.51			|2	|$16.51	|
		
		

