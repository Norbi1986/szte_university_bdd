package com.epam.szte.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.szte.bdd.utils.PageObject;

public class SearchResultsPage extends PageObject {

	private WebDriver driver;
	
	public SearchResultsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(css=".center_column .product-listing")
	WebElement searchResultHeader;
	
	@FindBy(css="#center_column .product-name")
	WebElement productName;
	
	public String getSearchResultHeader() {
		return searchResultHeader.getText();
	}
	
	public String getProductName() {
		return productName.getText();
	}

}
