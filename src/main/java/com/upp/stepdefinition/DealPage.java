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
	DashBoard_Module dm;
	public String tsid;
	public static String sourceAccountNo = "1";
	public static String toaccountNo = "2";
	public static String dealId = "";
	public static String AccountNo1 = "1";
	public static String AccountNo2 = "1";
	public static ExcelReader externalData;

	public DealPage(DashBoard_Module dm) {
		this.dm = new DashBoard_Module();
		externalData = new ExcelReader();
	}

	@Given("Open browser and enter url")
	public void open_browser_and_enter_url() {
//		driver.get(prop.getProperty("QAUrl"));
		driver.get(url);
	}

	@Then("Login to the application as {string}")
	public void login_to_the_application_as(String users) throws Exception {
		// new LoginToApplication().login(users, prop);
		LoginToApplication login = new LoginToApplication();
		login.login(users, prop);
	}

	

	



	@Then("Logout from Application")
	public void logout_from_Application() throws Exception {
		dm.logout();
	}
	
	@Then("search in google")
	public void search_in_google() throws Exception{
	    
	}


	


	@Override
	public void handleCallback(String callbackid, Object data) throws Exception {

		

	
	}

}
