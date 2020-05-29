package leaftap.pages;

import leaftap.api.ProjectSpecificationMethod;

public class HomePage extends ProjectSpecificationMethod
{
	public MyHomePage clickCRMSFALink()
	{
		System.out.println("CRMSFA Home page to My Home Page");
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}
	
}

