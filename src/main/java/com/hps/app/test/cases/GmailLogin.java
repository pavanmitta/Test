package com.hps.app.test.cases;


import org.testng.annotations.Test;

import com.ctaf.Report;
import com.hps.app.test.pages.AppPage;
import com.hps.selenium.core.main.BaseTestCase;

public class GmailLogin extends BaseTestCase {

	@Test
	public static void test_login()
	{
		Report.step("Check the Default Login Fields on the Gmail Login Page");
		AppPage.verifyDefaultFields();
		Report.step("Select UserName on the Gmail Login Page");
		AppPage.selectUName();
		Report.step("Select Password on the Gmail Login Page");
		AppPage.selectPwd();
		Report.step("Select SignIn on the Gmail Login Page");
		AppPage.selectLoginButton();
	}

}
