/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8.TugasNama;

/**
 *
 * @author Farrel
 */
public class Ahnaf {
     public static void hurufA() {
          int x,y;
for(x=1;x<=5;x++){
 for (y=1;y<=5;y++){
     if(x==1 || x == 3||y==1||y==5){
System.out.print("@");
 }   
else
System.out.print(" ");
}
            System.out.println(" ");
        }
}
public static void hurufH() {
        int x,y;
for(x=1;x<=5;x++){
 for (y=1;y<=5;y++){
     if(x==3||y==1||y==5){
System.out.print("@");
 }   
else
System.out.print(" ");
}
            System.out.println(" ");
        }
}
public static void hurufN() {
        int sp;
        for (sp = 0; sp < 2; sp++) {
            System.out.println("");
        }

        for (int n = 0; n < 3; n++) {
            System.out.print("N");
        }
        for (int nsp = 0; nsp < 5; nsp++) {
            System.out.print(" ");
        }
        for (int m = 0; m < 2; m++) {
            System.out.print("N");
        }
        System.out.println("");//baris1
        System.out.print("NN");
        for (int n1 = 0; n1 < 1; n1++) {
            System.out.print(" ");
        }
        System.out.print("NN");
        for (int n1 = 0; n1 < 3; n1++) {
            System.out.print(" ");
        }
        System.out.println("NN");//baris 2
        System.out.print("NN");
        for (int n1 = 0; n1 < 2; n1++) {
            System.out.print(" ");
        }
        System.out.print("NN");
        for (int n1 = 0; n1 < 2; n1++) {
            System.out.print(" ");
        }
        System.out.println("NN");//baris3
        System.out.print("NN");//Faathin.com
        for (int n1 = 0; n1 < 3; n1++) {
            System.out.print(" ");
        }
        System.out.print("NN");
        for (int n1 = 0; n1 < 1; n1++) {
            System.out.print(" ");
        }
        System.out.println("NN");//baris4

        for (int n = 0; n < 2; n++) {
            System.out.print("N");
        }
        for (int nsp = 0; nsp < 5; nsp++) {
            System.out.print(" ");
        }
        for (int m = 0; m < 3; m++) {
            System.out.print("N");
        }
        System.out.println("");//baris5
    }

public static void hurufF() {
                  int x,y;
for(x=1;x<=5;x++){
 for (y=1;y<=5;y++){
     if(x==1 || x == 3||y==1){
System.out.print("@");
 }   
else
System.out.print(" ");
}
            System.out.println(" ");
        }
    }

public static void main(String [] args) {
   hurufA();
    System.out.println("_____________");
   hurufH();
   System.out.println("_____________");
   hurufN();
   System.out.println("_____________");
   hurufA();
   System.out.println("_____________");
   hurufF();
}
}
