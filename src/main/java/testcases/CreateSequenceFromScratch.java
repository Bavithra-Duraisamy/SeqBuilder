package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.WelcomePage;

public class CreateSequenceFromScratch extends BaseClass {
	@Test(groups = {"success"})
	public void createManualSequence() throws IOException {
		WelcomePage wp = new WelcomePage();
		wp.verifyTitle()
		.clickNewSequenceButton()
		.clickCreateFromScratch()
		.enterSequenceName("Email Manual Sequence 1")
		.clickAddAction()
		.selectEmailAction()
		.enterSubject("Subject 1")
		.enterEmailBody("Email body 1")
		.clickSaveButton()
		.verifyMissingDataIconIsNotDisplayed()
		.clickLaunchButton()
		.verifyLeadsDashboard();
	}
}
