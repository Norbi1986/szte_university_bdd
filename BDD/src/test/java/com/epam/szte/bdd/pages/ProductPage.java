package com.epam.szte.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.epam.szte.bdd.utils.PageObject;

public class ProductPage extends PageObject {

	private WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(css="#quantity_wanted")
	private WebElement productQuantityField;
	
	@FindBy(css="#add_to_cart button")
	private WebElement addToCart;
	
	@FindBy(css=".button-container .continue")
	private WebElement continueShopping;
	
	public void setTheQuantity(int quantity) {
		productQuantityField.sendKeys(Integer.toString(quantity));
	}
	
	public String getQuantityNumbet() {
		return productQuantityField.getText();
	}
	
	public void clickOnAddToCartButton() {
		addToCart.click();
	}
	
	public void clickOnContinueShoppingButton() {
		continueShopping.click();
	}
	
	/**
	 * Órai Feladat
	 */
	
	@FindBy(css=".attribute_select")
	private Select productSize;
	
	public void selectSize(String size) {
		productSize.selectByVisibleText(size);
	}
	
	public String getSelectedSize(String size) {
		return productSize.getFirstSelectedOption().toString();
	}

}
