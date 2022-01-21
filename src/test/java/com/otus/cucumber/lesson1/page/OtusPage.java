package com.otus.cucumber.lesson1.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.util.List;

public class OtusPage {

    private static final String abc = "asdsds";

    @Autowired
    private WebDriver driver;

    @Autowired
    private LoginBlock loginBlock;

    @Autowired
    private Environment env;

    @FindBy(css = abc)
    private List<WebElement> topicList;

    @FindBy(css = ".btn-primary.btn-small.login-button")
    private WebElement loginButton;

    private void init() {
        PageFactory.initElements(driver, this);
    }

    public void open() {
        String url = env.getProperty("otus.url");
        driver.get(url);
    }

    public void openTopic(int i) {
        topicList.get(i).findElement(By.cssSelector("a")).click();
    }

//    public void click(String buttonName) {
//        buttons.get(buttonName.toLowerCase()).click();
//    }

    public LoginBlock getLoginBlock() {
        return loginBlock;
    }
}
