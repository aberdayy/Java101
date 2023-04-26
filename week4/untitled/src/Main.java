import java.util.Random;
import java.util.Scanner;

import static jdk.internal.icu.text.UTF16.charAt;


public class Main {
    public static void main(String[] args) {

    }
    public static void zodiacSign(){
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int day = input.nextInt();


        if ((day > 23 && month == 12) || (day < 20 && month == 1)) {
            System.out.println("1. burc");
        }
        else if( (day > 21 && month == 1) || (day < 20 && month == 2)) {
            System.out.println("1. burc");
        }
        else if( (day > 21 && month == 2) || (day < 20 && month == 3)) {
            System.out.println("1. burc");
        }
        else if( (day > 21 && month == 3) || (day < 20 && month == 4)) {
            System.out.println("1. burc");
        }
        else if( (day > 21 && month == 4) || (day < 20 && month == 5)) {
            System.out.println("1. burc");
        }
        else if( (day > 21 && month == 5) || (day < 20 && month == 6)) {
            System.out.println("1. burc");
        }
        else if( (day > 21 && month == 6) || (day < 20 && month == 7)) {
            System.out.println("1. burc");
        }
        else if( (day > 21 && month == 7) || (day < 20 && month == 8)) {
            System.out.println("1. burc");
        }
        else if( (day > 21 && month == 8) || (day < 20 && month == 9)) {
            System.out.println("1. burc");
        }

    }
    public static void leapYear(){
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if(year % 4==0){
            System.out.println("Leap");
        }else{
            System.out.println("not leap");

        }
    }
    public static void guessGame(){
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int myNum = input.nextInt();
        int num = random.nextInt(0,5);
        int chances = 1;
        while (chances>0){
            if (myNum == num){
                System.out.println("Congrats you find the number");
            }else{
                chances--;
                System.out.println("You failed. ");
            }
        }
    }
    public static void guessGameThreeChances(){
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int myNum = input.nextInt();
        int num = random.nextInt(0,5);
        int chances = 1;
        while (chances>0){
            if (myNum == num){
                System.out.println("Congrats you find the number");
            }else{
                chances--;
                System.out.println("You failed. ");
            }
        }
    }
    public static void repeatName(){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(str+str);
    }
    public static void checkChar(){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int length = str.length();
        int i = length - 1;
        if (charAt(str, 0)==charAt(str,i)){
            System.out.println("Same values");
        }else{
            System.out.println("not same values");
        }
    }
    public static void compare(){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int num = input.nextInt();
        int len = str.length();
        if (len > num){
            System.out.println("BIG");
        }else{
            System.out.println("small");
        }

    }
    public static void discoAgeCheck(){
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();
        if ((2023-year) >=18 ){
            if (month<=3){
                if (day<=15){
                    System.out.println("welcome to nightlife");
                }else {
                    System.out.println("go home kid");
                }
            }else {
                System.out.println("go home kid");
            }
        }else {
            System.out.println("go home kid");
        }
    }
}