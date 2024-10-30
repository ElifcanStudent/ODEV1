package com.elifcan;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

        /**
         * Kullanıcıdan 0-100 arası bir sayı girmesini isteyeceksiniz. Bu sayılar dışında bir değer girer
         * ise girilen sayı sınır dışında bir sayıdır uyarısı vereceksiniz. Temel kural olarak Kullanıcının girdiği
         * geçerli sayıların toplamı 100 ü geçtiğinde sayı istemeyi durduracaksınız. Kullanıcıdan alınan sayıların en
         * büyük olanı, en küçük olanı ve ortalamasını hesaplayan kodu yazınız.
         *
         * Örn:
         * Sayı gir…: 5
         * Sayı gir…: 12
         * Sayı gir…: 55
         * Sayı gir…: 43
         * Max: 55
         * Min: 5
         * Ort: 28.75
         *
         * Örn:
         * Sayı gir…: 95
         * Sayı gir…: 105
         * Girilen sayı aralık dışı
         * Sayı gir…: 1
         * Sayı gir…: 5
         * Max: 95
         * Min: 1
         * Ort: 33,666666666664
         */
        Scanner sc = new Scanner(System.in);

        float toplam = 0;
        boolean yuzdenkucuk = true;
        int [] sayiDizisi = new int[100]; // kullanıcı 0 ile 100 arasında en küçük olarak 100 tane 1 sayısı gireceği için 100 elemanlı bir dizi oluşturuyorum.
        int i = 0; // sayidizisinin indexini 0'dan başlatmış oluyorum.

        do{

            System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz: ");
            int n = sc.nextInt(); // kullanıcının girdiği sayı n değerine eşitlendi.




            if (yuzdenkucuk == n < 100 && yuzdenkucuk == n > 0) {

                toplam += n;
                if (toplam > 100){
                    break;
                }
                sayiDizisi[i] = n;
                i++;
            }
            if ( n > 100 ) {
                System.out.println("Girilen sayıları sınır dışıdır.");
            }
            if ( n <= 0 ){
                System.out.println("Girilen sayıları sınır dışıdır.");
            }

        }while (yuzdenkucuk==true);

        /**
         * En küçük sayıyı bulmak için işlemler aşağıdaki gibidir.
         */

        int enKucuk = sayiDizisi[0];

        for (int j = 1 ; j < sayiDizisi.length; j++){
            if (sayiDizisi[j] != 0){
                if (sayiDizisi[j] < enKucuk){
                    enKucuk = sayiDizisi[j];

                }
            }
        }
        System.out.println("Min: " + enKucuk);

        /**
         * En büyük sayıyı bulmak için işlemler aşağıdaki gibidir.
         */

        int enBuyuk = sayiDizisi[0];

        for (int j = 1 ; j < sayiDizisi.length; j++){
            if (sayiDizisi[j] != 0){
                if (sayiDizisi[j] > enBuyuk){
                    enBuyuk = sayiDizisi[j];

                }
            }
        }
        System.out.println("Max: " + enBuyuk);

        /**
         * Ortalama bulma işlemleri aşağıdaki gibidir.
         */


        for(int j = 0 ; j < sayiDizisi.length; j++){
            if (sayiDizisi[j] == 0){
                System.out.println("Ortalama: " + toplam/(j));
                break;
            }
        }
    }
}
