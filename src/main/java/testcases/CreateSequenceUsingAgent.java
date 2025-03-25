package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.CreateSequenceUsingAgentPage;

public class CreateSequenceUsingAgent extends BaseClass {
	
	@Test(groups = {"success"})
	public void createSequenceUsingAgent() throws IOException {
		CreateSequenceUsingAgentPage agent = new CreateSequenceUsingAgentPage();
		agent.clickNewSequenceButton()
		.clickCreateUsingAgent()
		.selectKnowledgeBase()
		.enterJobTitle("Medical Receptionist")
		.selectDatePosted("8")
		.clickCreateButton();
	}

}
