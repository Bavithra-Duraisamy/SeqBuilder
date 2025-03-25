package pages;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import base.BaseClass;

public class CreateKnowledgeBaseThroughWebUrls extends BaseClass {
	Faker faker = new Faker();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public CreateKnowledgeBaseThroughWebUrls clickKnowledgeBaseMenu() {
		driver.findElement(By.xpath(prop.getProperty("knowledge_base_menu"))).click();
		return this;
	}

	public CreateKnowledgeBaseThroughWebUrls clickAddIcon() {
		driver.findElement(By.xpath(prop.getProperty("add_icon"))).click();
		return this;
	}

	public CreateKnowledgeBaseThroughWebUrls enterKnowledgeBaseName() {
		String kbName = faker.name().username();
		System.out.println("Faker name is: " + kbName);
		driver.findElement(By.xpath(prop.getProperty("knowledge_base_name_input"))).sendKeys(kbName);
		return this;
	}

	public CreateKnowledgeBaseThroughWebUrls clickAddButton() {
		driver.findElement(By.xpath(prop.getProperty("add_documents_button"))).click();
		return this;
	}

	public CreateKnowledgeBaseThroughWebUrls selectAddWebPagesOption() {
		driver.findElement(By.xpath(prop.getProperty("add_web_pages_option"))).click();
		return this;
	}

	public CreateKnowledgeBaseThroughWebUrls enterWebAddress() {
		List<String> realDomains = List.of("google.com", "wikipedia.org", "github.com", "amazon.com",
				"stackoverflow.com", "nurturebox.ai");
		// Pick a random real domain
		String domain = realDomains.get(new Random().nextInt(realDomains.size()));
		String webAddress = "https://" + domain + "/" + faker.lorem().word();
		System.out.println("Webaddress is: " + webAddress);
		driver.findElement(By.xpath(prop.getProperty("url_input"))).sendKeys(webAddress);
		return this;
	}

	public CreateKnowledgeBaseThroughWebUrls clickPopupSaveButton() {
		driver.findElement(By.xpath(prop.getProperty("popup_save_button"))).click();
		return this;
	}

	public CreateKnowledgeBaseThroughWebUrls selectSiteMapCheckbox() {
		WebElement siteMapCheckbox = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("site_map_checkbox"))));
		siteMapCheckbox.click();
		return this;
	}

	public CreateKnowledgeBaseThroughWebUrls clickSiteMapSaveButton() {
		WebElement siteMapSaveButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty("site_map_save_button"))));
		siteMapSaveButton.click();
		return this;
	}

	public KnowledgeBaseSummaryPage clickKnowledgeBaseSaveButton() {
		driver.findElement(By.xpath(prop.getProperty("knowledgebase_save_button"))).click();
		return new KnowledgeBaseSummaryPage();
	}

}
