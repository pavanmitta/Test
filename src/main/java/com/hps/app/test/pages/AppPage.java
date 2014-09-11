package com.hps.app.test.pages;

import com.hps.app.test.maps.AppMap;

public class AppPage extends AppMap
{
	public static void EnterUName()
	{
		enterText(fieldUName(),"pavan");
	}
	public static void EnterPwd()
	{
		enterText(fieldPwd(),"pavan");
	}
	public static void LoginButton()
	{
		click(buttonSignIn());
	}
	
}
