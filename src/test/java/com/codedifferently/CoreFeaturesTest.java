package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class CoreFeaturesTest {

    @Test
    public void addTest(){
        //Given 
        CoreFeatures cf = new CoreFeatures();
        Double expected = 6;
        //When
        Double actual =  cf.add(5);
        //Then 
        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void subtractTest(){
        //Given 
        //When
        //Then 

    }

    @Test
    public void divideTest(){
        //Given 
        //When
        //Then 

    }

    @Test
    public void multiplyTest(){
        //Given 
        //When
        //Then
        //Assert.assertEquals(expected, actual); 

    }
    @Test
    public void ExpTest(){
        //Given 
        //When
        //Then 

    }

    @Test
    public void squareTest(){
        //Given 
        //When
        //Then 

    }

    @Test
    public void squareRootTest(){
        //Given 
        //When
        //Then 

    }

    @Test
    public void inverseTest(){
        //Given 
        //When
        //Then 

    }

    @Test
    public void invertSignTest(){
        //Given 
        //When
        //Then 

    }
}