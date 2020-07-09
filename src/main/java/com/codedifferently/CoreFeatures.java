package com.codedifferently;

//Import-tant lol
import java.lang.Math;
                        //to access display functions
public class CoreFeatures extends Display{
/* We will do add and subtract because the rest should have similar implementations.
 * Reminder: Java has a Math Class to complete these tools.
 */

    // + add(double):double
    public Double add(Double num){
        return num + getCurrentValue();
    }

    // + subtract(Double): Double
    public double subtract(double num){
        //code goes here
        return num;
    }

    public double divide(double num){
        //code goes here
        return num;
    }
    
    public double multiply(double num){
        return getCurrentValue() * num ;
    }

    public double Exp(double num){
        return Math.pow(getCurrentValue(), num);
    }

}