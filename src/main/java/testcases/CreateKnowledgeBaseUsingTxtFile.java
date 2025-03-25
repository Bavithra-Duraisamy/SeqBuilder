package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.CreateKnowledgeBaseThroughTextFiles;

public class CreateKnowledgeBaseUsingTxtFile extends BaseClass {
	@Test(groups = {"success"})
	public void createKnowledgeBase() {
		CreateKnowledgeBaseThroughTextFiles kb = new CreateKnowledgeBaseThroughTextFiles();
		kb.clickKnowledgeBaseMenu()
		.clickAddIcon()
		.enterKnowledgeBaseName()
		.clickAddButton()
		.selectAddTextOption()
		.enterTextFileName()
		.enterTextContent()
		.clickPopupSaveButton()
		.clickKnowledgeBaseSaveButton()
		.verifyKnowledgeBaseSummary();
	}

}
