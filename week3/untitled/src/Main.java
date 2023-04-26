public class Main {
    public static void main(String[] args) {
        System.out.println(converter(30)+" F");
        System.out.println(findBiggestNum(5,9,12));
        System.out.println(oddOrEven(6));
    }
    public static double converter(double celcius){
        double calc = (celcius*1.8)+32;
        return calc;
    }
    public static int findBiggestNum(int num1, int num2, int num3){
        int max = num1;
        if(num2 > max) {
            max = num2;
        }
        if(num3 > max) {
            max = num3;
        }
        return max;
    }
    public static String oddOrEven(int num){
        String que;
        if (num%2==0){
            que = "the number is even / cift";
        }else {
            que ="the number is odd / tek ";
        }
        return que;
    };
}
