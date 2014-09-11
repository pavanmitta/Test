package com.hps.app.test.cases;


import org.testng.annotations.Test;

import com.ctaf.Report;
import com.hps.app.test.pages.GmailPage;
import com.hps.selenium.core.main.BaseTestCase;

public class GmailLogin1 extends BaseTestCase {

	@Test
	public static void test_login()
	{
		Report.step("Check the Default Login Fields on the Gmail Login Page");
		GmailPage.verifyDefaultFields();
		Report.step("Select Login fields on the Gmail Login Page");
		GmailPage.completeLoginForm();
	}

}
