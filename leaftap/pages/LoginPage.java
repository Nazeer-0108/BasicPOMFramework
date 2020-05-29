package leaftap.pages;

import leaftap.api.ProjectSpecificationMethod;

public class LoginPage extends ProjectSpecificationMethod 
{
	public LoginPage enterUserName (String data)
	{
		driver.findElementById("username").sendKeys(data);
		return this;
	}
	
	public LoginPage enterPassword (String data)
	{
		driver.findElementById("password").sendKeys(data);
		return this;
	}
	
	public LogoutPage clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		return new LogoutPage();
	}
	
	
	
}
