package testCaseDetails;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dmsMethod.CommonMethod;

public class TC006_LoginwithBlankPassword extends CommonMethod{
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC006_LoginwithBlankPassword";
		testCaseDescription ="LoginFailcase";
		category = "Regrssion Testing";
		author= "Magesh";
	}
	@Test
	public void loginWithBlankPassword()	
	{
		
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName,"DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword," ");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		closeBrowser();
		
	}

}
