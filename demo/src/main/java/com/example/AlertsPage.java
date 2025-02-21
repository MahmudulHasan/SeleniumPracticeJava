package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By results = By.id("result");
    private By triggerConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void triggerALert() {
        driver.findElement(triggerAlertButton).click();
    }
    public void triggerConfirm() {
        driver.findElement(triggerConfirmButton).click();
    }
    public void alert_clickToAccept() {
        driver.switchTo().alert().accept();
    }
    public void alert_clickToDismiss() {
        driver.switchTo().alert().dismiss();
    }
    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }
    public String getResult() {
        return driver.findElement(results).getText();
    }
}
