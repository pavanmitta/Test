package com.hps.app.test.maps;

import org.openqa.selenium.By;

import com.hps.selenium.core.obj.BasePage;
import com.hps.selenium.core.sizzlecss.BySizzle;
import com.hps.selenium.core.util.ExpectedElements;

public class GmailMap extends BasePage
{
	public static ExpectedElements loginFields = new ExpectedElements(buttonSignIn(), fieldUName(), fieldPwd());
	public static By fieldUName()
	{
		return BySizzle.css("#Email");
	}
	
	public static By fieldPwd()
	{
		return BySizzle.css("#Passwd");
	}
	public static By buttonSignIn()
	{
		return BySizzle.css("#signIn");
	}
}
