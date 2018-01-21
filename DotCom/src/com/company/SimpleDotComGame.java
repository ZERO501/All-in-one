package com.company;

import java.util.Random;

public class SimpleDotComGame {
    public static void main(String[] args) {

        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom sdc = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        sdc.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("введите число");
            String result = sdc.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Win")) {
                isAlive = false;
                System.out.println("Ходов- " + numOfGuesses);
            }
        }

    }
}
