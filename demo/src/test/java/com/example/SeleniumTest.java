package com.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    private String url = "https://the-internet.herokuapp.com/";
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        goHome();
        homePage = new HomePage(driver);
    }
    @BeforeMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
