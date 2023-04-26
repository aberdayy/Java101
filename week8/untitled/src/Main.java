import java.util.*;

public class Main {
    public static void main(String[] args) {
    //System.out.println(first());
    int[] arr =  {1,2,3,4,5,5,2};
    char[] charArr1 = {'a', 'b', 'c', 'd', 'f'};
    char[] charArr2 = {'f', 'c', 'g', 'h', 'a'};
    String[] arr2 ={"aa","araba","ev","BIRSEY","dsa","HOOOOOOOOOO","asdjasdhasjkdhad"};
    int num = 60;
    //second(arr);
    //third(arr);
    //fourth(charArr1,charArr2);
    //fifth(arr2,num);
    //sixth(num);
    sixth(num);

    }
    public static String first(){

        //Write a function which simulates tossing a coin 100 times and prints heads/tails count.
        Random random = new Random();

        int heads=0;
        int tails=0;
        for (int i = 0; i<100; i++){
            int toss = random.nextInt(0,2);
            if (toss == 0){
                tails+=1;
            }else{
                heads+=1;
            }
        }
    String result = "total heads count = " + heads + "\n"+" total tails count = "+tails;
        return result;
    }
    public static void second (int[] myArr){
        //Write a function which takes an array of integers and returns the reversed array.
        int[] reversedArr = new int[myArr.length];
        int j = myArr.length - 1;
        for (int i = 0; i < myArr.length; i++) {
            reversedArr[i] = myArr[j];
            System.out.println(reversedArr[i]);
            j--;
        }



    }
    public static void third(int[] arr){
    //Write a function which prints the duplicate values of an array of integer values.
        int len = arr.length;
        for (int i = 0; i<len; i++){
            for (int j = i +1; j<len;j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }

        }

    }
    public static void fourth(char[] char1, char[] char2){
        //Write a function which takes two array of chars to find the non-duplicate values
        //among both arrays. Returns the duplicate chars as a list of result
        List<Character> result = new ArrayList<>();
        List<Character> newArr = new ArrayList<>();

        for (char c:char1){
            newArr.add(c);
        }
        for(char c:char2){
            if (newArr.contains(c)){
                result.add(c);
            }
        }
        System.out.println("duplicate => "+result);
    }
    public static void fifth (String[] arr, int num){
        //Write a function which takes array of strings and a number. Returns the list of strings
        //whose length is bigger than given number.
        for (String s:arr){
            if (s.length()>=num){
                System.out.println(s);
            }
        }
    }
    public static void sixth(int num){
        //Write a funcion which takes a number n and generates a list of n numbers between
        //0-100. Returns the number in the list that is closest to the average of the list.

        //random sayi icin import
        Random rand = new Random();
        //sayilari tutacak list
        List<Integer> myList = new ArrayList<>();
        //rastgele sayilarin listeye atanmasi
        for (int i=0;i<num;i++){
            int ran= rand.nextInt(100);
            myList.add(ran);
        }
        //atanan sayilarin ekrana yazdirilmasi
        for (int m:myList) {
            System.out.println(m+"***");
        }
        //ortalama hesaplamak icin toplama islemi
        int sum=0;
        for(int m:myList){
            sum = sum +m;
        }
        System.out.println(sum+"toplam");
        //ortalamanin bulunmasi
        int aver = sum/num;
        System.out.println(aver+"ortalama");

        //ortalamaya en yakin degeri bulmak icin listedeki ilk degerin degiskene atanmasi
        int closest = myList.get(0);
        //listedeki ilk deger ile ortalamanin farkinin mutlak degerinin alinmasi
        int fark = Math.abs(closest - aver);

        for (int i = 1; i<num;i++){
            //listedeki ikinci degerden baslayarak degerlerin ortalamadan cikarilarak mutlak degerinin alinmasi
            int temp = Math.abs(myList.get(i)-aver);
            //donguye gore gelen ortalamanin farki alindaktan sonra mutlak degeri alinan degerin bu islemi ilk sayiyla yaptigimizda gelen degerden kucuk olma kontrolu
            if (temp<fark){
                //eger deger kucuk ise dongudeki sayi degerinin degiskene atanmasi
                closest = myList.get(i);
                //o sayinin ortalama farkinin degiskene atanmasi ve artik bu degerin islem icin kullanilmasi
                fark = temp;
            }
        }
        System.out.println(closest);
    }
}




