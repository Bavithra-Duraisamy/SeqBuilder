package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class KnowledgeBaseSummaryPage extends BaseClass {

	public void verifyKnowledgeBaseSummary() {
		String knowledgeBaseDashboardPage = driver.findElement(By.xpath(prop.getProperty("knowledgebase_summary"))).getText();
		if(knowledgeBaseDashboardPage.equalsIgnoreCase("Knowledge Base")) {
			System.out.println("Knowledge Base Summary page is displayed successfully!..");
		}
	}
}
