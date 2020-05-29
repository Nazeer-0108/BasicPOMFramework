package leaftap.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import leaftap.api.ProjectSpecificationMethod;
import leaftap.pages.FindLeadPage;
import leaftap.pages.HomePage;
import leaftap.pages.LoginPage;
import leaftap.pages.LogoutPage;
import leaftap.pages.MyHomePage;
import leaftap.pages.MyLeadsPage;
import leaftap.pages.ViewLeadPage;
import leaftap.pages.DuplicateLeadPage;

public class TC005_DuplicateLead extends ProjectSpecificationMethod 
{
	@BeforeTest
	public void setData()
	{
		excelFile = "DuplicateLead";
	}
	
	@Test(dataProvider = "getData")
	public void duplicateLead(String uName, String pwd, String phone, String industry) throws InterruptedException
	{
		System.out.println("Duplicate Lead starts here ***************");
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin();
		
		new HomePage().clickCRMSFALink();
		
		new MyHomePage().clickLeadsMenu();
		
		new MyLeadsPage().clickFindLeadsLink();
		
		new FindLeadPage()
		.clickPhoneTab()
		.phoneNumberSearch(phone)
		.clickFindLeadButton()
		.clickFirstLeadID();
		
		new DuplicateLeadPage()
		.clickDuplicateButton()
		.enterIndustry(industry)
		.clickSubmitDuplicateLead();
		
		new ViewLeadPage()
		.GetLeadName()
		.GetDuplicateLeadName();
		
		System.out.println("Duplicate Lead ends here ***************");
	}
	
	@AfterMethod
	public void LogOff() 
	{
		new LogoutPage().clickTestLeafLogout();
	}
	
}
