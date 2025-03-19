package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.CreateKnowledgeBaseThroughTextFiles;

public class CreateKnowledgeBase extends BaseClass {
	@Test(groups = {"success"})
	public void createKnowledgeBase() {
		CreateKnowledgeBaseThroughTextFiles kb = new CreateKnowledgeBaseThroughTextFiles();
		kb.clickKnowledgeBaseMenu()
		.clickAddIcon()
		.enterKnowledgeBaseName("Knowledge Base 1")
		.clickAddButton()
		.selectAddTextOption()
		.enterTextFileName("Text File 1")
		.enterTextContent("Text content 1")
		.clickTextFileSaveButton()
		.clickKnowledgeBaseSaveButton()
		.verifyKnowledgeBaseSummary();
	}

}
