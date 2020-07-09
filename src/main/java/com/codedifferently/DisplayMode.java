package com.codedifferently;

public class DisplayMode {

    int i = 0; 

    String[] displayModeList = {"decimal", "octal", "binary","hexadecimal"};

    // - whichMode: String
    private String whichMode = displayModeList[i];


    // + switchDisplayMode(): void
    public void switchDisplayMode(){
          i++;

          if(i == 4){
              i = 0;
          }

          whichMode = displayModeList[i];
    }

    // + switchDisplayMode(String): String
    public String switcDisplayMode(String mode){
             return mode;

    }

    // + getMode: String
    public String getMode(){
        return whichMode;
    }
}