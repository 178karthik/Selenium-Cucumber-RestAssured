package com.upp.pagemodules.Login;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.upp.base.BaseClass;
import com.upp.pageobjects.Object_NewDeal;
import com.upp.pageobjects.Object_Login;
import com.upp.utils.DateUtils;
import com.upp.utils.DropDown;
import com.upp.utils.ExcelReader;
import com.upp.utils.JavascriptClick;
import com.upp.utils.ScrollTypes;

public class LoginToApplication extends BaseClass {

	public static Object_Login ol;
	public static Properties prop;

	public LoginToApplication() {

		ol = new Object_Login();

	}

	public void login(String userName,String password) throws Exception{


		
		ol.usernameInput.sendKeys(userName);
		ol.passwordInput.sendKeys(password);
		ol.loginButton.click();
		applyExplicitWaitsUntilElementClickable(ol.dashboardText,Duration.ofSeconds(10));
		ol.dashboardText.isDisplayed();
	}

}
