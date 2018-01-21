package com.company;

import java.util.ArrayList;

public class SimpleDotCom {

  // private int[] locationCells;
   private ArrayList<String> locationCells;
   // private int numOfHints=0;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String stringGuess) {
       // int guess = Integer.parseInt(stringGuess);
        String result = "lose";
        /*for (int cell : locationCells) {
            if (guess == cell) {
                result = "get";
                numOfHints++;
                break;
            }
        }*/
        int index =locationCells.indexOf(stringGuess);
        if (index>=0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result="get";
            }
            else {
                result="win";
            }
        }
       /* if (numOfHints == locationCells.length) {
            result = "Win";
        }*/
       // System.out.println(result);
        return result;
    }
}
