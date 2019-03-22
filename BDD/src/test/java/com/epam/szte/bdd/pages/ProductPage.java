package com.epam.szte.bdd.pages;

import org.openqa.selenium.WebDriver;

import com.epam.szte.bdd.utils.PageObject;

public class ProductPage extends PageObject {

	private WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	

}
