package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.LoginPage;

public class BaseClass {

	public static ChromeDriver driver;

	public static ExtentReports report;

	public String fileName;

	public static Properties prop;
	

	@BeforeSuite
	public void generateReport() {
		// Step 1: Setup the path for the report
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/loginPage.html");

		// Step 2: Generate/Create a report
		report = new ExtentReports();

		// Step 3: Attach the report
		report.attachReporter(reporter);

	}

	@Parameters({ "username", "password", "url" })
	@BeforeMethod
	public void preConditions(String username, String password, String url) throws IOException {
		// Initialize Properties object and load the properties file
		prop = new Properties();
		try (FileInputStream fis = new FileInputStream("src/main/resources/elements.properties")) {
			prop.load(fis);
			System.out.println("Properties file loaded successfully: " + prop);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error loading properties file.");
		}
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		LoginPage lp = new LoginPage();
		lp.launchUrl(url).enterUsername(username).enterPassword(password).clickLoginButton();
	}

	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}

	@AfterSuite
	public void closeReport() {
		report.flush();
	}

}
