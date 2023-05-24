import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //soru => Write a java game where program asks user how many numbers he/she will enter, then asks and accepts that many numbers. Finally, prints all the numbers user entered backwards.
        Scanner input = new Scanner(System.in);
        int i = 0;

        //Kullaniciya kac sayi gircegini sor
        System.out.print("kac sayi girceksin? ");
        int kullanicininGirdigiSayiMiktari = input.nextInt();

        //kullacidan aldigimiz bilgiye gore kac tane sayi girecegini arraye tanimliyoruz.
        int[] sayilar = new int[kullanicininGirdigiSayiMiktari];

        // kullanicinin girdigi sayilari kaydet tanimladigimiz arraye kaydet
        System.out.println("sayilari gir ");

        while (i< kullanicininGirdigiSayiMiktari)
        {
            sayilar[i] = input.nextInt();
            i++;
        }

        int a = kullanicininGirdigiSayiMiktari - 1;
        // sayilari tersten bas

        System.out.println("girdigin sayilarin tersten hali");
        while(a >= 0)
        {
            System.out.println(sayilar[a]);
            a--;
        }


    }
}