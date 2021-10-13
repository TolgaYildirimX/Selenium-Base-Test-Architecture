package maventest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
	
	protected WebDriver driver;
	PracticeFormPage practiceFormPage;
	
	@BeforeAll
	public  void setUp () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tolgay\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		practiceFormPage = new PracticeFormPage(driver);
	}
	
//	@AfterAll
//	public void tearDown() {
//		
//		driver.quit();
//	}

	
}
