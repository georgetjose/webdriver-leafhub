package com.learnerhub.testcases;

import com.framework.testng.api.base.ProjectHooks;
import com.learnerhub.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC003_ForgotPassword extends ProjectHooks {

    @BeforeTest
    public void setValues() {
        testcaseName = "Register";
        testDescription = "Register a new user";
        authors = "Babu";
        category = "Smoke";
    }

    @Test
    public void forgotPassword() {
        new LoginPage().clickForgotPassword()
                .enterUsername("George")
                .selectSecurityQuestion("What is your favorite color?")
                .enterAnswer("white")
                .enterNewPassword("Test@123")
                .enterConfirmPassword("Test@123");
    }
}
