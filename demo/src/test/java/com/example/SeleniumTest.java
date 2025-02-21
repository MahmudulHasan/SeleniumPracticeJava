package com.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    private String url = "https://the-internet.herokuapp.com/";
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
