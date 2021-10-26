 package com.company;
import java.util.Scanner;

// import java.util.Locale;

public class panagram {
   public static void letter(String ch){
        ch=ch.toLowerCase();
        boolean alpha=true;
        for (char x='a';x<='z';x++){
            if (!ch.contains(String.valueOf(x))){
                alpha=false;
                break;
            }
        }
        if (alpha){
            System.out.println("yes!"+ch+" ita a Panagram");
        }
        else
            System.out.println("no the word\t"+"("+ ch+")" +" is not a Panagram");
    }
    public static void main(String[] args) {

        System.out.print("enter the String you wanna check:-\t");
        Scanner y= new Scanner(System.in);
        String ch=y.nextLine();
        letter(ch);

    }
}
