package com.company;

public class Main {

    public static void main(String[] args) {

       int x=0, y=0;
       while (x<5)  {

           //y=x-y;  5th
          // y=y+x; 7th
          /* x=x+1;
           y=y+x;      2th   */
        /*  y=y+2;
          if (y>4) {
              y=y-1;
          }  8th */


           System.out.print(x+""+y+" ");
           x=x+1;
       }



    }
}
