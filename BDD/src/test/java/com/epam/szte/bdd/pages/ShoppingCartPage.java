package com.epam.szte.bdd.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.szte.bdd.dao.Product;
import com.epam.szte.bdd.utils.PageObject;

public class ShoppingCartPage  extends PageObject {

	private WebDriver driver;
	
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(css=".product-name")
	private List<WebElement> productName;
	
	@FindBy(css=".cart_unit .price")
	private List<WebElement> unitProductPrice;
	
	@FindBy(css=".cart_total .price")
	private List <WebElement> totalProductPrice;
	
	@FindBy(css=".cart_quantity_input")
	private List <WebElement> productQuantity;
	
	public List<Product> getProducts() {
		return null;
	}
	
	/**
	 * Órai Feladat
	 */
	
	@FindBy(css=".alert")
	private WebElement alertMessage;
	
	@FindBy(css=".cart_delete")
	private WebElement deleteButton;
	
	public void clicOndeleteButton() {
		deleteButton.click();
	}
	
	public String getAlertMessage() {
		return alertMessage.getText();
	}
	
}
