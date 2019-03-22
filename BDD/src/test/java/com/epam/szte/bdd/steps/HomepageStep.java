package com.epam.szte.bdd.steps;

import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.HomepagePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomepageStep {

	private HomepagePage homepagePage = new HomepagePage(Hooks.driver);
	
	@Given("^I open the My Store page$")
	public void openMyStorePage() {
		homepagePage.openMyStorePage();
	}
	
	@When("I click on the Sign in button")
	public void clickOnSignInPage() {
		homepagePage.clickOnsigInButton();
	}
	
	@When("^I type the \"([^\"]*)\" on search field$")
	public void searchingForItem(String item) {
		homepagePage.searchOnTextField(item);
	}
	
	@When("^I click on Search button$")
	public void clickOnSearchButton() {
		homepagePage.clickOnSearchButton();
	}
}
