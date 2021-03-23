package com.epam.szte.bdd.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.beans.SamePropertyValuesAs.samePropertyValuesAs;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.epam.szte.bdd.dao.Product;
import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.ShoppingCartPage;

import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;

public class ShoppingCartStep {

	private ShoppingCartPage shoppingCartPage = new ShoppingCartPage(Hooks.driver);

	@Then("^I see the shopping cart page$")
	public void shoppingCartPageIsDisplayed() {
		assertTrue("The shopping cart page is not displayed", shoppingCartPage.shoppingCartIsDisplayed()); 
	}
	
	@Then("^I see the added items$")
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
		assertThat(actualProducts.size(), equalTo(expectedProducts.size()));
		Iterator<Product> actualIterator = actualProducts.iterator();
		for (Product expectedProduct : expectedProducts) {
			assertThat("failed", actualIterator.next(), samePropertyValuesAs(expectedProduct));
		}
	}
	
}
