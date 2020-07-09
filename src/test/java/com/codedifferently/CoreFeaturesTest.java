package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class CoreFeaturesTest {

    @Test
    public void addTest(){
        //Given : Given the informarion we already have, ex: Our Object...
        CoreFeatures cf = new CoreFeatures();
        //When : When we do this action...

        Double actual =  cf.add(5.0); // action we're testing 
        Double expected = 5.0;  //expected outcome

        //Then : Then it is assumed that...
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
        CoreFeatures cf = new CoreFeatures();
        Double expected = 6; 
        Double actual =  cf.divide(5);
        //Then 
        Assert.assertEquals(expected, actual, 0);


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
        CoreFeatures cf = new CoreFeatures();
        Double expected = 125.0; 
        Double actual =  cf.Exp(5);
        //Then 
        Assert.assertEquals(expected, actual, 0);
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