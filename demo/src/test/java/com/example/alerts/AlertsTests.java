package com.example.alerts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.example.SeleniumTest;

public class AlertsTests extends SeleniumTest{

    @Test
    public void testAcceptAlert() {
        // Test code will go here
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerALert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Results text incorrect");
    }

    @Test
    public void testGetTextFromAlert() {
        // Test code will go here
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }
}
