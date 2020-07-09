package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class DisplayModeTest {
    
    @Test
    public void switchDisplayModeTest(){
         
        DisplayMode display = new DisplayMode();
        dm.switchDisplayMode();
        dm.switchDisplayMode();
        String expected = "octal";
    
        //When
        String actual = display.getMode();
       
    
        //Then 
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void switcDisplayModeTest(){


        //Given 
        DisplayMode dm = new DisplayMode();
        dm.switcDisplayMode("octal");
        String expected = "octal";
        //When
        String actual = dm.getMode();
        //Then 
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getMode(){
        
        DisplayMode dm = new DisplayMode();
        String expected = dm.getMode();
        Assert.assertEquals(expected, dm.getMode());

    }
}