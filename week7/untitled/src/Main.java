import java.util.Random;

public class Main {
    public static void main(String[] args) {
    first(10);
    System.out.println("---first end---");
    int[] arr =  {1,2,3,4};
    second(arr);
    System.out.println("---second end---");

    int[] myArr_1 =  {10,2,3,4};
    int[] myArr_2 =  {90,6,7,8};
    third(myArr_1,myArr_2);
    System.out.println("---third end---");
    fourth(myArr_1);
    System.out.println("---fourth end---");
    fifth(myArr_1);
    System.out.println("---fifth end---");
    char[] myArr_3 = {'A','B','C','D','E'};
    sixth(myArr_3);
    }
    public static void first(int howMany){
        Random random = new Random();
        int[] myArr = new int[howMany];

        for (int i=0;i<=9; i++){
            int nums = random.nextInt(20);
            myArr[i] = nums;

            System.out.println(myArr[i] +" ");
        }

    }
    public static void second(int[] myArr){
        int len = myArr.length;
        len = len-1;
        int sum=0;

        for (int j = 0; j<=len;j++){
            sum += myArr[j];
        }
        System.out.println(sum);
    }
    public static void third(int[] frstArr, int[] secArr){
        int firstLen = frstArr.length;
        //firstLen = firstLen-1;
        int secLen = secArr.length;
        secLen = secLen-1;
        int small_1 = Integer.MAX_VALUE;
        int small_2= Integer.MAX_VALUE;
        for (int i=0; i<firstLen;i++){
            if (small_1>=frstArr[i]){
                small_1=frstArr[i];
            }
        }
        for (int i=0; i<secLen;i++){
            if (small_2>=secArr[i]){
                small_2=secArr[i];
            }
        }
        System.out.println(small_1);
        System.out.println(small_2);
    }
    public static void fourth(int[] Arr){
        int firstLen = Arr.length;
        int max = 0;
        int maxInd = -1;
        for (int i=0; i<firstLen;i++){
            if (max<=Arr[i]){
                max=Arr[i];
                maxInd= i;
            }
        }
        System.out.println(maxInd);
    }
    public static void fifth(int[] Arr){
        Random random = new Random();
        int[] shuffled = new int[4];
        for (int i =0; i<Arr.length;i++){
            int randomNums = random.nextInt(Arr.length);
            shuffled[i] = Arr[randomNums];
            System.out.println(i+". index = "+shuffled[i]);
        }
    }
    public static void sixth (char[] Arr){
        int len = Arr.length;
        char temp = Arr[len-1];
        for (int i = len-1; i>0;i--){
           Arr[i] = Arr[i-1];
        }
        Arr[0] = temp;

        for (char e:Arr){
            System.out.println(e);
        }
    }
    }
