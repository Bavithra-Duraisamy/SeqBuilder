package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import base.BaseClass;

public class LoginPage extends BaseClass {

	ExtentTest test = report.createTest("Login", "Login with valid credentials!..");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public LoginPage launchUrl(String url) {
		driver.get(url);
		return this;
	}

	public LoginPage enterUsername(String uname) throws IOException {
		driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(uname);
		test.pass("Username has been entered!..",
				MediaEntityBuilder.createScreenCaptureFromPath(".././Snaps/LoginPage.jpeg").build());

		return this;
	}

	public LoginPage enterPassword(String pwd) {
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(pwd);
		test.pass("Password has been entered!..");
		return this;

	}

	public WelcomePage clickLoginButton() {
		// Locate the element first
		WebElement loginButton = driver.findElement(By.xpath(prop.getProperty("login_button")));

		// Wait until the element is NOT stale
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(loginButton)));

		// Now click the login button
		loginButton.click();
		test.pass("Login button is clicked!..");
		return new WelcomePage();
	}

}
