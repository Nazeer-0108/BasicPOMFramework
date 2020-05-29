package leaftap.pages;

import leaftap.api.ProjectSpecificationMethod;

public class LogoutPage extends ProjectSpecificationMethod
{
	public LoginPage clickTestLeafLogout()
	{
		driver.findElementByXPath("//a[contains(text(), 'Logout')]").click();
		System.out.println("Logout from TestLeaf page");
		System.out.println("************************************************************************");
		return new LoginPage();
	}
	
	public LoginPage clickHomePageLogout()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("Logout from Home page");
		System.out.println("************************************************************************");
		return new LoginPage();
	}
}
