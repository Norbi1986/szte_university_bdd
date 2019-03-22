package com.epam.szte.bdd.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.szte.bdd.utils.PageObject;

public class CommonPage extends PageObject {

	private WebDriver driver;
	
	public CommonPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(css="h1")
	private WebElement productName;
	
	@FindBy(css=".product-name")
	private List<WebElement> productNames;

}
