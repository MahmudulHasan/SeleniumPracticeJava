package com.example.alerts;

import org.testng.annotations.Test;

import com.example.SeleniumTest;
import static org.testng.Assert.assertEquals;

public class FileUploadTests extends SeleniumTest {
    // Test code will go here
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("/Users/autul/FinalSeleniumPractice/demo/resources/deepseek.png");
        assertEquals(uploadPage.getUploadedFiles(), "deepseek.png", "Uploaded files incorrect");
    }
    
}
