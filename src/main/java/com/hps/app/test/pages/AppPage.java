package com.hps.app.test.pages;

import com.hps.app.test.maps.AppMap;
//import com.hps.selenium.core.conditions.ConditionGroup;
import com.hps.selenium.core.conditions.Conditions;

public class AppPage extends AppMap
{
	
	public static void verifyDefaultFields()
	{
		verify(Conditions.presenceOfElement(fieldUName()),true);
		verify(Conditions.presenceOfElement(fieldPwd()),true);
		verify(Conditions.presenceOfElement(buttonSignIn()),true);
//		verifyEach(loginFields.get(ConditionGroup.PRESENCE_OF_ALL));
	}
	public static void selectUName()
	{
		enterText(fieldUName(),"pavan");
	}
	public static void selectPwd()
	{
		enterText(fieldPwd(),"pavan");
	}
	public static void selectLoginButton()
	{
		click(buttonSignIn());
	}
	
}
