package com.drMuller.step_definitions;

import com.drMuller.pages.LoginPage;
import io.cucumber.java.en.Given;

public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("User logins with valid credentials {string} {string}")
    public void user_logins_with_valid_credentials(String email, String password) {
       loginPage.login(email, password);
    }



}
