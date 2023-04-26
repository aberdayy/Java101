import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //It's your turn
        //numberMultiplier();
        //addsThreeNumbersTogether();
       // writeNumberInReverseOrder();
        calculateTaxes();
    }
    public static void numberMultiplier(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number1 = scanner.nextInt();
        int total = number1*number1;
        System.out.println(total);
    }
    public static void addsThreeNumbersTogether(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me three numbers: ");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int total = number1 + number2 + number3;
        System.out.println(total);

    }
    public static void writeNumberInReverseOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me two numbers: ");
        String number1 = scanner.next();
        String number2 = scanner.next();

        System.out.println(number2 + " " +number1);
    }
    public static void calculateTaxes(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me price of an item => ");
        double price = scanner.nextDouble();
        System.out.println("Give me quantity of an item => ");
        int quantity = scanner.nextInt();
        double total = price*quantity;
        double taxes = total * 0.20;
        double All = total+taxes;
        System.out.println("Total without taxes => " + total + "\nTotal with taxes =>"+All + "\nSales tax %20 => "+taxes);


    }
}














