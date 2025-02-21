package com.example.hover;

import org.testng.annotations.Test;

import com.example.HoversPage;
import com.example.SeleniumTest;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class HoverTests extends SeleniumTest {
    @Test
    public void testHover() {
        HoversPage hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
    
}
