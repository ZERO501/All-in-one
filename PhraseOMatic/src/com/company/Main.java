package com.company;

public class Main {

    public static void main(String[] args) {

        String[] wordListOne = {"круглосуточный", "взаимный", "умный","динамичный"};
        String[] wordListTwo = {"гениальный","общий", "ускоренный", "сетевой"};
        String[] wordListThree = {"процесс", "образец", "талант", "подход"};

        int oneLength= wordListOne.length;
        int twoLength= wordListTwo.length;
        int threeLength= wordListThree.length;

        int rand1 = (int) (Math.random()*oneLength);
        int rand2 = (int) (Math.random()*twoLength);
        int rand3 = (int) (Math.random()*threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("все, что нам нужно, - это " + phrase);
        System.out.println(rand1 +" "+ rand2+ " "+ rand3);

    }
}
