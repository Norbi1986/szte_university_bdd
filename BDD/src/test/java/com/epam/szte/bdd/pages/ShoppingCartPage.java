package com.epam.szte.bdd.pages;

import org.openqa.selenium.WebDriver;

import com.epam.szte.bdd.utils.PageObject;

public class ShoppingCartPage  extends PageObject {

	private WebDriver driver;
	
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
}
