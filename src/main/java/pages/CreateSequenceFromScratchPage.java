package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class CreateSequenceFromScratchPage extends BaseClass {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public CreateSequenceFromScratchPage clickNewSequenceButton() {
		driver.findElement(By.xpath(prop.getProperty("new_sequence_button"))).click();
		return this;
	}

	public CreateSequenceFromScratchPage clickCreateFromScratch() {
		driver.findElement(By.xpath(prop.getProperty("create_from_scratch_option"))).click();
		return this;
	}

	public CreateSequenceFromScratchPage enterSequenceName(String seqName) {
		driver.findElement(By.xpath(prop.getProperty("sequence_name_input_box"))).sendKeys(seqName);
		return this;
	}

	public CreateSequenceFromScratchPage clickAddAction() {
		driver.findElement(By.xpath(prop.getProperty("add_action_button"))).click();
		return this;
	}

	public CreateSequenceFromScratchPage selectEmailAction() {
		// Wait until the element is present
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("email_action_option"))));

		// Now find the element and click
		WebElement emailOption = driver.findElement(By.xpath(prop.getProperty("email_action_option")));
		emailOption.click();

		return this;
	}

	public CreateSequenceFromScratchPage enterSubject(String subject) {
		driver.findElement(By.xpath(prop.getProperty("subject_input"))).sendKeys(subject);
		return this;
	}

	public CreateSequenceFromScratchPage enterEmailBody(String emailBody) {
		driver.findElement(By.xpath(prop.getProperty("email_body_input"))).sendKeys(emailBody);
		return this;
	}

	public CreateSequenceFromScratchPage clickSaveButton() {
		driver.findElement(By.xpath(prop.getProperty("save_button"))).click();
		return this;
	}

	public CreateSequenceFromScratchPage verifyMissingDataIconIsNotDisplayed() {
		boolean iIcon = driver.findElement(By.xpath(prop.getProperty("i_icon"))).isDisplayed();
		if (iIcon) {
			System.out.println("All the required info has been provided.");
		}
		return this;
	}

	/*
	 * public SequencePage verifyGmailIsConnected() { boolean connectGmailButton =
	 * driver.findElement(By.xpath("//button[text()='Connect Now']")).isDisplayed();
	 * if (connectGmailButton) {
	 * System.out.println("Gmail is connected already!.."); } else {
	 * driver.findElement(By.xpath("//button[text()='Connect Now']")).click();
	 * driver.findElement(By.xpath("//p[text()='Gmail / G-suite']")).click(); }
	 * return this; }
	 */

	public CandidatesPage clickLaunchButton() {
		driver.findElement(By.xpath(prop.getProperty("launch_button"))).click();
		return new CandidatesPage();
	}
}
