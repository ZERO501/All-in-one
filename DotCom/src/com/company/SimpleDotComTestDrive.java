package com.company;

import java.util.ArrayList;

public class SimpleDotComTestDrive {

    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        //int[] locations = {2, 3, 4};
        ArrayList<String> locations = new ArrayList<String>;
        locations = {2, 3, 4};
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
       /* String testResult = "lose";
        if (result.equals("get")) {
            testResult = "Win";
        }
        System.out.println(testResult);*/
    }

}
