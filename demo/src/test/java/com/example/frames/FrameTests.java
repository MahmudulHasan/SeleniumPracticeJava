package com.example.frames;

import org.testng.annotations.Test;

import com.example.SeleniumTest;
import static org.testng.Assert.assertEquals;

public class FrameTests extends SeleniumTest {
    // Test code will go here
   // @Test
    public void testWysiwyg(){
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();
        String text1 = "hello ";
        String text2 = "world";
        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);
        assertEquals(editorPage.getTextFromEditor(), text1+text2, "Text from editor is incorrect");
    }
    
}
