package com.elifcan;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        /**
         *
         * Kübik number ları yazdıracaksınız ancak ekranda çıktılandığı şekilde olması istenmektedir
         * Örn:
         * Bir sayı giriniz…: 5
         * Sayı 1:125
         * Sayi 2:64
         * Sayi 3:27
         * Sayi 4:8
         * Sayi 5:1
         *
         * Bir sayı giriniz…: 9
         * Sayi 1:729
         * Sayi 2:512
         * Sayi 3:343
         * Sayi 4:216
         * Sayı 5:125
         * Sayi 6:64
         * Sayi 7:27
         * Sayi 8:8
         * Sayi 9:1
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int kubik = sc.nextInt();

        for (int i = kubik ; i >0; i--) {
            int sira = kubik - i + 1; //Kübik sayıların başındaki sıra nımarasını verecek olan sayı formülü
            System.out.println("Sayi " + sira + ":" + i*i*i);

        }
    }
}
