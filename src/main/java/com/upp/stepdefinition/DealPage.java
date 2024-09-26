package com.upp.stepdefinition;

import java.io.IOException;

import com.upp.base.BaseClass;

import com.upp.pagemodules.BasicDetails;
import com.upp.pagemodules.DashBoard_Module;
import com.upp.pagemodules.Login.LoginToApplication;
import com.upp.utils.ExcelReader;
import com.upp.utils.SwitchWindow;

import callbackInterfaces.ICallback;
import io.cucumber.java.en.*;

public class DealPage extends BaseClass implements ICallback {
	public static String AccountNo1;
	public LoginToApplication login;
	public static ExcelReader externalData;

	public DealPage(DashBoard_Module dm) {
		externalData = new ExcelReader();
		login = new LoginToApplication();
	}

	@Given("Open browser and enter url")
	public void open_browser_and_enter_url() {
     	//driver.get(prop.getProperty("QAUrl"));
		driver.get(url);
	}

	@Then("Login to the application as {string} and {string}")
	public void login_to_the_application_as_and(String username, String password) throws Exception {
		login.login(username,password);
	}

	
	@Override
	public void handleCallback(String callbackid, Object data) throws Exception {


	
	}

}
