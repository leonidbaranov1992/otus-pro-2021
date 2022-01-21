package com.otus.cucumber.lesson1.step;

import com.otus.cucumber.lesson1.page.MainPage;
import com.otus.cucumber.lesson1.page.OtusPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.ast.DataTable;
import org.springframework.beans.factory.annotation.Autowired;

public class MyStepdefs {

    @Autowired
    OtusPage otusPage;

    @Autowired
    MainPage mainPage;

    @Then("Click to {string}")
    public void clickToКурсы(String string, DataTable table) {

    }

    @Given("User open (OtusPage|MainPage) page")
    public void userOpenPage(Object pageName) {
        if (pageName instanceof OtusPage) {
            otusPage.open();
        }
        else if (pageName instanceof MainPage) {
            mainPage.open();
        }
    }
}
