package maventest;

import org.junit.jupiter.api.Test;

public class Test_setting_name_email_lastname extends BaseTest {

	
	@Test
	public void setName() {
		practiceFormPage.setName("Tolga");
	
		
	}
	
	@Test
	public void setLastName() {
		practiceFormPage.setLastName("Yildirim");
	}
	
	@Test
	public void setEmail () {
		practiceFormPage.setEmail("tolgayyildirim87@gmail.com");
		
	}
	
	

	
	
	
}
