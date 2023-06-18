package com.learnerhub.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectHooks;
import org.openqa.selenium.support.ui.Select;

public class ForgotPasswordPage extends ProjectHooks{

	public ForgotPasswordPage enterUsername(String username) {
		clearAndType(locateElement(Locators.ID, "userName"), username);
		reportStep("Username entered successfully","pass");
		return this;
	}
	
	public ForgotPasswordPage selectSecurityQuestion(String securityQuestion) {
		Select securityQuestionDropdown = new Select(locateElement(Locators.NAME, "secQuest"));
		securityQuestionDropdown.selectByValue("What is your favorite color?");
		reportStep("Security Question Selected successfully", "pass");
		return this;
	}

	public ForgotPasswordPage enterAnswer(String answer) {
		clearAndType(locateElement(Locators.ID, "answer"), answer);
		reportStep("Answer entered successfully","pass");
		return this;
	}

	public ForgotPasswordPage enterNewPassword(String newPassword) {
		clearAndType(locateElement(Locators.ID, "newPassword"), newPassword);
		reportStep("New Password entered successfully","pass");
		return this;
	}

	public ForgotPasswordPage enterConfirmPassword(String confirmPassword) {
		clearAndType(locateElement(Locators.ID, "confirmPassword"), confirmPassword);
		reportStep("Confirm Password entered successfully","pass");
		return this;
	}

	public LoginPage clickReset() {
		click(locateElement(Locators.XPATH, "//input[@value='Reset']"));
		reportStep("Reset button clicked successfully", "pass");
		return new LoginPage();
	}
	
}
