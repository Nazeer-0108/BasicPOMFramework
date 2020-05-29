package leaftap.pages;

import leaftap.api.ProjectSpecificationMethod;

public class MyLeadsPage extends ProjectSpecificationMethod
{
	public MergeLeadPage clickMergeLead()
	{
		System.out.println("MyLeads page to Merge Lead Page");
		driver.findElementByXPath("(//a[@href= '/crmsfa/control/mergeLeadsForm'])").click();
		return new MergeLeadPage();
	}
	
	public CreateLeadPage clickCreateLeadLink()
	{
		System.out.println("My Leads Page to Create Lead Page");
		driver.findElementByXPath("//a[contains(text(), 'Create Lead')]").click();
		return new CreateLeadPage(); 
	}
	
	public FindLeadPage clickFindLeadsLink()
	{
		System.out.println("My Leads Page to Find Lead Page");
		driver.findElementByXPath("//a[contains(text(), 'Find Leads')]").click();
		return new FindLeadPage();
	}
	
}

