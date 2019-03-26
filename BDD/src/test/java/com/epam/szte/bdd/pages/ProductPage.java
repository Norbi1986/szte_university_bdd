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
	
	@FindBy(css="[itemprop=\"name\"]")
	private WebElement productName;
	
	@FindBy(css="#quantity_wanted")
	private WebElement productQuantityField;
	
	@FindBy(css="#add_to_cart button")
	private WebElement addToCart;
	
	@FindBy(css=".button-container .continue span")
	private WebElement continueShopping;
	
	public String getSelectedProductName() {
		return productName.getText();
	}
	
	public void setTheQuantity(String quantity) {
		productQuantityField.clear();
		productQuantityField.sendKeys(quantity);
	}
	
	public String getQuantityNumbet() {
		return productQuantityField.getAttribute("value");
	}
	
	public void clickOnAddToCartButton() {
		addToCart.click();
	}
	
	public void clickOnContinueShoppingButton() {
		continueShopping.click();
	}
	
	/**
	 * �rai Feladat
	 */
	
	@FindBy(css=".attribute_select")
	private WebElement productSize;
	
	public void selectSize(String size) {
		Select select = new Select(productSize);
		select.selectByVisibleText(size);
	}
	
	public String getSelectedSize(String size) {
		Select select = new Select(productSize);
		return select.getFirstSelectedOption().getText();
	}

}
