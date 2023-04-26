import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class Main {
    public static void main(String[] args) {
//        passwordCheck("merhaba122");
        System.out.println(isLetter(5));
    }
    public static int sum(int num, int num2){
        return num + num2;
    }
    public static int div(int num, int num2) throws Exception{
        return num / num2;
    }
    public static int average(int num, int num2) throws Exception {
        int total = sum(num,num2);
        int result = div(total,2);
        return result;
    }
    public static void passwordCheck(String pass){
        int length = pass.length();
        length =length -1;
        int intCount =0;
        boolean lengthCheck = false;
        boolean rulesCheck = true;
        boolean digitCheck = false;
        for (int i =0; i<=length; i++){
            if (isDigit(pass.charAt(i))){
                intCount++;
            }
            if(isLetter(pass.charAt(i)) == false){
                rulesCheck = false;
            }
        }
        if (length>=8){
            lengthCheck = true;
            System.out.println("password is ok!1");

            if (rulesCheck== true){
                System.out.println("password is ok!2");

                if (intCount>=2){
                    digitCheck=true;
                    System.out.println("password is ok!3");
                }
            }
        }

    }

}