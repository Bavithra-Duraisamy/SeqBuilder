package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class CreateKnowledgeBaseThroughTextFiles extends BaseClass {
	
	public CreateKnowledgeBaseThroughTextFiles clickKnowledgeBaseMenu() {
		driver.findElement(By.xpath(prop.getProperty("knowledge_base_menu"))).click();
		return this;
	}
	
	public CreateKnowledgeBaseThroughTextFiles clickAddIcon() {
		driver.findElement(By.xpath(prop.getProperty("add_icon"))).click();
		return this;
	}
	
	public CreateKnowledgeBaseThroughTextFiles enterKnowledgeBaseName(String kbName) {
		driver.findElement(By.xpath(prop.getProperty("knowledge_base_name_input"))).sendKeys(kbName);
		return this;
	}
	
	public CreateKnowledgeBaseThroughTextFiles clickAddButton() {
		driver.findElement(By.xpath(prop.getProperty("add_documents_button"))).click();
		return this;
	}
	
	public CreateKnowledgeBaseThroughTextFiles selectAddTextOption() {
		driver.findElement(By.xpath(prop.getProperty("add_text_option"))).click();
		return this;
	}
	
	public CreateKnowledgeBaseThroughTextFiles enterTextFileName(String txtFileName) {
		driver.findElement(By.xpath(prop.getProperty("text_filename_input"))).sendKeys(txtFileName);
		return this;
	}
	
	public CreateKnowledgeBaseThroughTextFiles enterTextContent(String textContent) {
		driver.findElement(By.xpath(prop.getProperty("text_content"))).sendKeys(textContent);
		return this;
	}
	
	public CreateKnowledgeBaseThroughTextFiles clickTextFileSaveButton() {
		driver.findElement(By.xpath(prop.getProperty("text_file_save_button"))).click();
		return this;
	}
	
	public KnowledgeBaseSummaryPage clickKnowledgeBaseSaveButton () {
		driver.findElement(By.xpath(prop.getProperty("knowledgebase_save_button"))).click();
		return new KnowledgeBaseSummaryPage();
	}

}
