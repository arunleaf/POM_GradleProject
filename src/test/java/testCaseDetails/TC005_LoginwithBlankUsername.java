package testCaseDetails;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dmsMethod.CommonMethod;

public class TC005_LoginwithBlankUsername extends CommonMethod {
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC005_LoginwithBlankUsername";
		testCaseDescription ="LoginPass";
		category = "Regrssion Testing";
		author= "Magesh";
	}
	@Test
	public void loginWithBlankUsername()	
	{
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName," ");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		closeBrowser();
	}
	
}
