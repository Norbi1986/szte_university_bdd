package com.epam.szte.bdd.steps;


import java.util.List;
import java.util.Map;

import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.ShoppingCartPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class ShoppingCartStep {

	private ShoppingCartPage shoppingCartPage = new ShoppingCartPage(Hooks.driver);

	@Then("I see the added items")
	public void checkTheAddedItems(DataTable dt) {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).get("First Name"));
			System.out.println(list.get(i).get("Last Name"));
		}
	}
	
	/**
	 * Órai Feladat
	 */
	
	@When("^I click on delete button$")
	public void clickOnDeleteButton() {
		shoppingCartPage.clicOndeleteButton();
	}
	
	@Then("^$")
	public void checkEmptyCartAlert() {
		
	}
	
}
