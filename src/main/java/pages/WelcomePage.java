package pages;

import base.BaseClass;

public class WelcomePage extends BaseClass {

	public CreateSequenceFromScratchPage verifyTitle() {
		String welcomePageTitle = driver.getTitle();
		if(welcomePageTitle.equalsIgnoreCase("NurtureBox — Your outbound recruiting automation platform")) {
			System.out.println("Dashboard page is displayed successfully!..");
		}
		return new CreateSequenceFromScratchPage();
	}
}
