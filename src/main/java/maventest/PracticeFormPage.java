package maventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage {

	private WebDriver driver;
	private By name = By.id("firstName");
	private By lastname = By.id("lastName");
	private By email = By.id("userEmail");
	
	private GenderSection genderSection;
	
	
	public PracticeFormPage(WebDriver driver) {
		this.driver = driver;
		genderSection = new GenderSection(driver);
		
	}
	
	public GenderSection genderSection() {
		return this.genderSection;
	}
	
	public void setName(String nameText) {
		WebElement nameSpace  = driver.findElement(name);
		nameSpace.click();
		nameSpace.sendKeys(nameText);
	
	}
	
	public void setLastName (String lastnameText) {
		WebElement lastNameSpace = driver.findElement(lastname);
		lastNameSpace.click();
		lastNameSpace.sendKeys(lastnameText);
	
	}
	
	public void setEmail (String mailAddress) {
		WebElement mailSpace = driver.findElement(email);
		mailSpace.click();
		mailSpace.sendKeys(mailAddress);
	}

	

}
