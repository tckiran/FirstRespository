package Generic_librery;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_Class {
	public WebDriver driver;

	@BeforeClass(alwaysRun= true)
	public void browser_setup() {
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass(alwaysRun=true)
	public void Browser_teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		Reporter.log("browser successfully closed", true);

	}
}
