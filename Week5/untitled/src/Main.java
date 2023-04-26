import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7();
        //sp1();
        //sp2();
        //sp3();
        //sp4();
        //sp5();
        //sp6();
        //sp7();
        sp8();
        //sp9();
    }
    private static boolean pal(int number) {
        int temp = number;
        int reverse = 0;
        int lastnumber;
        while (temp!=0){
            lastnumber = temp%10;
            reverse = (reverse*10)+lastnumber;
            temp/=10;
        }
        if (number==reverse){
            return true;
        }else {
            return false;
        }
    }
    public static void ex1(){
        int i;
        for (i = 0;i<=100;i+=10){
            System.out.println(i);
        }
    }
    public static void ex2(){
        int i;
        for (i=-10;i<0;i++){
            System.out.println(i);
        }
    }
    public static void ex3(){
        int kullaniciNum = 5;
        String kullniciNa = "ata";

        while (kullaniciNum>0){
            System.out.println("welcome" + kullniciNa);
            kullaniciNum--;
        }
    }
    public static void ex4(){
        Random rand = new Random();
        int num = 10;
        while(num>0) {
            int int_random = rand.nextInt(2);
            if(int_random==0){
                System.out.println("TAILS");
            }else{
                System.out.println("HEADS");
            }
            num--;
        }
    }
    public static void ex5(){
        int numb = 1000;
        double interest = 0.08;
        int numD = numb*2;
        double total=0;
        int years = 0;
        while (numb < numD) {
            numb += (numb * interest);
            years++;
        }
        System.out.println("it takes " +years+ " years to double that money with %8 interest");
        }
    public static void ex6(){
    int x = 33;
    int y = 27;
    int R;
    while (y!=0){
        int temp = y;
        y = x%y;
        x=temp;
    }
    System.out.println(x);
    }
    public static void ex7(){
        int num = 202;
        System.out.println("Verilen sayi :" +num +"\n" +
                "Verilen sayi palindorme mi? : " + pal(num));

    }

    public static void sp1(){
        int i;
        for(i=0;i<=10;i++){
            System.out.println(i);
        }
    }
    public static void sp2() {
        int usr_inp = 9;
        for(int i = 0; usr_inp >= 0;usr_inp--){
            System.out.println(usr_inp);
        }
    }
    public static void sp3(){
        int n = 5;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    public static void sp4(){
        int num1 = 8;
        int pow =3;
        int temp = pow;
        int total = 1;
        while(temp>0){
            total = total*num1;
            temp--;
        }
        System.out.println(total);
    }
    public static void sp5(){
        int n = 5;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i%2==0){
            sum += i;
            }
        }
        System.out.println(sum);
    }
    public static void sp6(){
        int chance = 10;
        Random rand = new Random();
        int int_random = rand.nextInt(20);
        while(chance>0){
            Scanner in = new Scanner(System.in);
            int guess = in.nextInt();
            if (guess == int_random){
                System.out.println("Congrats You Found The Number : \n" +
                        "Your guess : "+guess +"\n" +
                        "Computer guess: " +int_random);
                chance=0;
            }else {
                chance--;
                System.out.println("You are a failure!\n" +
                        "Try again \n" +
                        "Chances left : "+chance);

            }
        }
    }
    public static void sp7(){
        int num =5;
        int total =1;
        for (int i = 0;num>0;num--){
            total *=num;
        }
        System.out.println(total);
    }
    public static void sp8(){
        int number = 10;
        System.out.println("Exponents Table for " + number + ":");
        System.out.println("------------------------");
        for(int i = 1; i <= number; i++) {
            System.out.print(i + "    \t");
            for(int j = 1; j <= 5; j++) {
                System.out.print(Math.pow(i, j) + "  \t");
            }
            System.out.println();
        }
    }
    public static void sp9(){
        int num = 10;
        int a = 0, b = 1, c = 0;
        System.out.print("Fibonacci Series till " + num + ": ");
        while (c <= num) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}