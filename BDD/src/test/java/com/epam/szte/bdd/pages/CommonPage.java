package com.epam.szte.bdd.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.szte.bdd.utils.PageObject;

import net.bytebuddy.implementation.bytecode.Throw;

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
	
	@FindBy(css="[title=\"Women\"]")
	private WebElement womenTab;
	
	@FindBy(css="[title=\"Dress\"]")
	private WebElement dressTab;

	public void clickOnSelectedTab(String tabName) {
		switch (tabName.toLowerCase()) {
		case "women":
			womenTab.click();
			break;
		case "dress":
			dressTab.click();			
		default:
			System.out.println("The Tab not exist");
		}
	}
}
