package testCaseDetails;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import dmsMethod.CommonMethod;

public class TC001_DmsLogin extends CommonMethod  {
    
	@BeforeClass
	public void setData() {
		testCaseName = "TC001_LoginPass";
		testCaseDescription ="LoginPass";
		category = "Functional Testing";
		author= "Kumar";
		dataSheetName="sheet";
	}
	@Test(dataProvider="TestSheet")
	public void LoginPass(String uname, String pwd, String data) throws InterruptedException {
		
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, uname);
		WebElement elePassword = locateElement("id","password");
		type(elePassword, pwd);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		Thread.sleep(3000);
		verifyPartialText(locateElement("id", "errorDiv"), data);	
	}
//@AfterSuite
//	public void Close()
//	{
//		closeAllBrowsers();
//	}
	
}
	
	
	
	
	
	
	
	
	
	
	