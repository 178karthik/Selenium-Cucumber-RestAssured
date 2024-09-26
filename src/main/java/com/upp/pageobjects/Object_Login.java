package com.upp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.upp.base.*;

public class Object_Login extends BaseClass {

	public Object_Login() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	public WebElement usernameInput;

	@FindBy(id = "password")
	public WebElement passwordInput;

	@FindBy(id = "login")
	public WebElement loginButton;
	@FindBy(xpath = "//h1[normalize-space()='Dashboard']")
	public WebElement dashboardText;


}
