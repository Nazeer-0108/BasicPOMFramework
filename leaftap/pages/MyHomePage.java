package leaftap.pages;

import leaftap.api.ProjectSpecificationMethod;

public class MyHomePage extends ProjectSpecificationMethod
{
	public MyLeadsPage clickLeadsMenu()
	{
		System.out.println("My-Home page to My-Leads Page");
		driver.findElementByLinkText("Leads").click();
		return new MyLeadsPage();
	}
	
}

