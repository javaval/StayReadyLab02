package com.codedifferently;
import java.util.Scanner;
/**
 * Hello world!
 *
 */

public class SciCalculator 
{
    private double currentValue;
    private DisplayMode displayMode;

    private TrigFeatures trigFeatures;

    private Display display; 
    
    private Memory memory;

    private CoreFeatures coreFeatures;

    private TrigUnits trigUnits;


    public SciCalculator(){    
        this.displayMode = new DisplayMode();
        this.display = new Display();
        this.trigFeatures = new TrigFeatures();
        this.memory = new Memory();
        this.coreFeatures = new CoreFeatures();
        this.trigUnits = new TrigUnits();
    }
    public static void main( String[] args ) 
    {
        //created SciCalObject inside the main.
        SciCalculator sciCalc = new SciCalculator();
        System.out.println("Welcome to your new Scientific Calculator! Please enter a number: ");
        Scanner input = new Scanner(System.in); 
        double userNumber = input.nextDouble(); 
        sciCalc.display.setCurrentValue(userNumber);
        System.out.println("The number you entered is: "+ userNumber);

        sciCalc.display.setCurrentValue(userNumber);
        System.out.println("Enter a second Number: ");
        
        double num2 = input.nextDouble();
        System.out.println("The number you entered is " + num2);

        System.out.println(sciCalc.coreFeatures.add(num2));
}
}
