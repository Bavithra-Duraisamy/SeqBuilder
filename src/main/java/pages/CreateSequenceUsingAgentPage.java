package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class CreateSequenceUsingAgentPage extends BaseClass {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public CreateSequenceUsingAgentPage clickNewSequenceButton() {
		driver.findElement(By.xpath(prop.getProperty("new_sequence_button"))).click();
		return this;
	}

	public CreateSequenceUsingAgentPage clickCreateUsingAgent() {
		driver.findElement(By.xpath(prop.getProperty("create_using_agent_option"))).click();
		return this;
	}

	public CreateSequenceUsingAgentPage selectKnowledgeBase() {
		/*
		 * WebElement element = wait.until(
		 * ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty(
		 * "knowledge_base_dropdown_arrow")))); JavascriptExecutor js =
		 * (JavascriptExecutor) driver; js.executeScript("arguments[0].click();",
		 * element);
		 */
		driver.findElement(By.xpath(prop.getProperty("knowledge_base_dropdown_arrow"))).click();
		driver.findElement(By.xpath(prop.getProperty("knowledge_base_dropdown_value"))).click();

		return this;
	}

	public CreateSequenceUsingAgentPage enterJobTitle(String title) {
		driver.findElement(By.xpath(prop.getProperty("job_title_input"))).sendKeys(title);
		return this;
	}

	public CreateSequenceUsingAgentPage selectDatePosted(String datePosted) {
		driver.findElement(By.xpath(prop.getProperty("date_posted_input"))).sendKeys(datePosted);
		return this;
	}

	public CandidatesPage clickCreateButton() {
		driver.findElement(By.xpath(prop.getProperty("create_button"))).click();
		return new CandidatesPage();
	}

}
