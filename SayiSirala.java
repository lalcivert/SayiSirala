package day01;

import java.util.Scanner;

public class SayiSirala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç tane sayı gireceksiniz ?: ");
        int n = input.nextInt();

        if(n<=0) {
            System.out.println("Hatalı sayı girişi..");
            return;
        }
        System.out.println("1. sayıyı giriniz: ");
        int ilkSayi = input.nextInt();
        int max = ilkSayi;
        int min = ilkSayi;

        for(int i= 2; i <= n; i++ ){
            System.out.print(i+". sayıyı giriniz: ");
            int sayi = input.nextInt();

            if(sayi > max){
                max = sayi;
            }

            if(sayi < min) {
                min = sayi;
            }
        }

        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);

    }
}
