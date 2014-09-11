package com.hps.app.test.pages;


import com.hps.app.test.maps.GmailMap;
import com.hps.selenium.core.conditions.ConditionGroup;
//import com.hps.selenium.core.conditions.Conditions;

public class GmailPage extends GmailMap
{
	
	public static void verifyDefaultFields()
	{
//		verify(Conditions.presenceOfElement(fieldUName()),true);
//		verify(Conditions.presenceOfElement(fieldPwd()),true);
//		verify(Conditions.presenceOfElement(buttonSignIn()),true);
		verifyEach(loginFields.get(ConditionGroup.PRESENCE_OF_ALL));
	}
	public static void completeLoginForm()
	{
		enterText(fieldUName(),"pavan");
		enterText(fieldPwd(),"pavan");
		click(buttonSignIn());
	}
	
}
