package com.epam.szte.bdd.steps;

import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.CommonPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonStep {

	private CommonPage commonPage = new CommonPage(Hooks.driver);
	
	@When("^I select the \"([^\"]*)\" product$")
	public void selectProduct(String productName) {
		
	}
	
	@Then("I see the \"([^\"]*)\" product page$")
	public void seeTheSelectedProduct(String productName) {
		
	}
	
	@When("I click on \"([^\"]*)\" tab")
	public void clickOnSelectedTab(String tabName) {
		
	}
	
}
