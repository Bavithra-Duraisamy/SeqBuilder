package pages;

import base.BaseClass;

public class CandidatesPage extends BaseClass {
	
	public CandidatesPage verifyLeadsDashboard() {
		String leadsDashboardTitle = driver.getTitle();
		if(leadsDashboardTitle.equalsIgnoreCase("NurtureBox — Your outbound recruiting automation platform")) {
			System.out.println("Leads Dashboard page is displayed");
		} else {
			System.out.println("Looks like there is a problem in launching your sequence!..");
		}
		return this;
	}

}
