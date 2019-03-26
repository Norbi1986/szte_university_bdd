package com.epam.szte.bdd.steps;


import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.epam.szte.bdd.dao.Product;
import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.ShoppingCartPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class ShoppingCartStep {

	private ShoppingCartPage shoppingCartPage = new ShoppingCartPage(Hooks.driver);

	@Then("^I see the shopping cart page$")
	public void shoppingCartPageIsDisplayed() {
		Assert.assertTrue("The shopping cart page is not displayed", shoppingCartPage.shoppingCartIsDisplayed()); 
	}
	
	@Then("I see the added items")
	public void checkTheAddedItems(DataTable dt) {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		List<Product> actualProducts = shoppingCartPage.getProducts();
		List<Product> expectedProducts = new ArrayList<Product>();
		for(int i = 0; i < list.size(); i++) {
			Product product = new Product();
			product.setProductName(list.get(i).get("Description"));
			product.setUnitProductPrice(list.get(i).get("Unit price"));
			product.setTotalProductPrice(list.get(i).get("Total"));
			product.setProductQuantity(list.get(i).get("Qty"));
			expectedProducts.add(product);
		}
		
		//Assert.assertSame("Not same", expectedProducts.listIterator(), actualProducts.listIterator());
		//Assert.assertArrayEquals(actualProducts, expectedProducts);
		Assert.assertEquals(expectedProducts.get(0).getUnitProductPrice(), actualProducts.get(0).getUnitProductPrice());
	}
	
	/**
	 * Órai Feladat
	 */
	
	private static String CART_IS_EMPTY = "cart is empty";
	
	@When("^I click on delete button$")
	public void clickOnDeleteButton() {
		shoppingCartPage.clicOndeleteButton();
	}
	
	@Then("^I can see the cart is empty$")
	public void checkEmptyCartAlert() {
		Assert.assertThat(shoppingCartPage.getAlertMessage(), is(containsString(CART_IS_EMPTY)));
	}
	
}
