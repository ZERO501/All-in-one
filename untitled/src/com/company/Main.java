package com.company;

public class Main {

    public static void main(String[] args) {

        int y = 0;
        String[] isl = new String[4];
        isl[0] = "Бермуды";
        isl[1] = "Фиджи";
        isl[2] = "Азорские";
        isl[3] = "Косумель";

        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int ref;
        while (y < 4) {
            ref = index[y];
            System.out.println(isl[ref]);
            y = y + 1;

        }

    }
}
