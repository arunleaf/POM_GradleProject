package testCaseDetails;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dmsMethod.CommonMethod;

public class TC003_LoginWrongPassword extends CommonMethod {
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC003_LoginFailWithPassword";
		testCaseDescription ="LoginWrongPassword";
		category = "Functional Testing";
		author= "Arun";
	}
	@Test
	public void loginFailWithPassword()	
	{
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "cfmsfaaa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		closeBrowser();
	}
}
