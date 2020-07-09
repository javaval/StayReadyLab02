package com.codedifferently;

public class Display{

    private double currentValue = 0.0; 

    public DisplayMode getDisplay(){
        DisplayMode dm = new DisplayMode();
        return dm;
    }

    public double getCurrentValue(){
        return currentValue;
    }
    
    public void clearCurrentValue(){
        currentValue = 0.0;
    }

    public void setCurrentValue(Double num){
        currentValue = num;
    }
  
    public Memory getMemory(){
        Memory mem = new Memory();
        return mem;
    }
    
    public CoreFeatures getCoreFeatures(){
        CoreFeatures cf = new CoreFeatures();
        return cf;
    }
    
    public TrigFeatures getTrigFeatures(){
        TrigFeatures tf = new TrigFeatures();
        return tf;
    }
    
    public TrigUnits getTrigUnits(){
        TrigUnits tu = new TrigUnits();
        return tu;
    }
}