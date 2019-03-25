package com.epam.szte.bdd.steps;

import org.junit.Assert;

import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.ProductPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductStep {

	private ProductPage productPage = new ProductPage(Hooks.driver);
	
	@When("^I set Quantity number to \"(\\d+)\"$")
	public void setQuantity(int quantity) {
		productPage.setTheQuantity(quantity);
	}
	
	@Then("^I see the Quantity number is \"([^\"]*)\"$")
	public void checkQuantityNumber(String quntity) {
		Assert.assertEquals(quntity, productPage.getQuantityNumbet());
	}
	
	@When("^I click on Add to cart button$")
	public void clickOnAddToCartButton() {
		productPage.clickOnAddToCartButton();
	}
	
	@When("^I click on continue shopping$")
	public void clicOnContinueShoppingButton() {
		productPage.clickOnContinueShoppingButton();
	}
	
	/**
	 * �rai Feladat
	 */
	
	@When("^I set Size to \"([^\"]*)\"$")
	public void setSize(String size) {
		productPage.selectSize(size);
	}
	
	@Then("^I see the selecte Size is \"([^\"]*)\"")
	public void checkTheSelectedSize(String size) {
		Assert.assertEquals(size, productPage.getSelectedSize(size));
	}
}