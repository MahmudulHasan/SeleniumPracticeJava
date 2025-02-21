package com.example;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.Test;

public class DropdownTests extends SeleniumTest {
    @Test
    public void testSelectOption() {
        DropDownPage dropdownPage = homePage.clickDropDown();
        String option = "Option 2";
        dropdownPage.selectFromDropdown(option);
        List<String> selectedOptions = dropdownPage.getSelectedOption();
        assertEquals(selectedOptions.size(), 1, "Incorrect Number of Selection");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
    
}
