package com.flipkart.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Login")
	private WebElement loginLink;

	@FindBy(xpath = "//div[text()='Fashion']")
	private WebElement FashionTab;

	@FindBy(linkText = "Men's Kurtas")
	private WebElement mensKurtaLink;

	@FindBy(xpath = "//div[text()='Beauty, Toys & More']")
	private WebElement beautyToysMoreTab;

	@FindBy(xpath = "//a[text()='View All']")
	private WebElement viewAllLink;

	@FindBy(xpath = "//input[@name='q']")
	private WebElement searchTextField;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement crossButton;

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getFashionTab() {
		return FashionTab;
	}

	public WebElement getMensKurtaLink() {
		return mensKurtaLink;
	}

	public WebElement getBeautyToysMoreTab() {
		return beautyToysMoreTab;
	}

	public WebElement getViewAllLink() {
		return viewAllLink;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getCrossButton() {
		return crossButton;
	}
	
}
