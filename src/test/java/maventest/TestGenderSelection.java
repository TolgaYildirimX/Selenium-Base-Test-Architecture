package maventest;

import org.junit.jupiter.api.Test;


public class TestGenderSelection extends BaseTest {
	
	@Test
	public void maleButton() {
		practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.MALE);
		
	}
	
	@Test
	public void femaleButton() {
		practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.FEMALE);
	}
	
	@Test
	public void otherButton() {
		practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.OTHER);
	}
	
	

}
