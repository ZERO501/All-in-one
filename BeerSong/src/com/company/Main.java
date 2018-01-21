package com.company;

public class Main {

    public static void main(String[] args) {
    int beerNum=4;
    String word ;

    while (beerNum>0) {

        switch (beerNum > 14 ? beerNum % 10 : beerNum) {
            case 1:
                word = "бутылка";
                break;
            case 2:
            case 3:
            case 4:
                word = "бутылки";
                break;
            default:
                word = "бутылок";
                break;
        }
     /*   if (beerNum==1) {
            word = "бутылка";
        }*/
        System.out.println(beerNum + " " + word + " пива на стене");
        System.out.println(beerNum + " " + word + " пива");
        System.out.println("возьми одну. Пусти по кругу");
        beerNum--;
        System.out.println();
        if (beerNum==0)
        System.out.println("Нет бутылок на стене");

        }

    }
    }

