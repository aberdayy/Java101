import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deger = scanner.nextInt();
        for(int i = 0; i<=deger; i++){
            if ((i%2)==0){
                System.out.println(i);
            }
        }

    trianglePattern(deger);

    }
    public static void trianglePattern(int gelen){
        for (int i=1; i<=gelen; i += 2){
            for (int k=0; k < (gelen - i); k++){
                System.out.print(" ");
            }for (int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void weirdApp (){
        //White a java program which takes a number from user untill input is 0, and prints the biggest
        //number user entered.

        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int num;
        do {
            System.out.print("a number");
            num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
        } while (num != 0);
        System.out.println("The largest number entered was " + max);
    }




}
