package com.example.keys;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import com.example.SeleniumTest;

public class KeysTest extends SeleniumTest{
    @Test
    public void testBackspace() {
        var keysPage = homePage.clickKeyPresses();
        keysPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keysPage.getResult(), "You entered: BACK_SPACE");
    }
}
