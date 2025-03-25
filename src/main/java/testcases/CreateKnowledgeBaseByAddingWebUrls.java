package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.CreateKnowledgeBaseThroughWebUrls;

public class CreateKnowledgeBaseByAddingWebUrls extends BaseClass {
	@Test(groups = {"success"})
	public void createKnowledgeBase() {
		CreateKnowledgeBaseThroughWebUrls kb = new CreateKnowledgeBaseThroughWebUrls();
		kb.clickKnowledgeBaseMenu()
		.clickAddIcon()
		.enterKnowledgeBaseName()
		.clickAddButton()
		.selectAddWebPagesOption()
		.enterWebAddress()
		.clickPopupSaveButton()
		.selectSiteMapCheckbox()
		.clickSiteMapSaveButton()
		.clickKnowledgeBaseSaveButton()
		.verifyKnowledgeBaseSummary();
	}
}
