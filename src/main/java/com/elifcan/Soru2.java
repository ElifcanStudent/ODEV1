package com.elifcan;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        /**
         * Bir yolculuk için toplam maliyeti hesaplayan kodu yazınız. Kurallar;
         * - L: LPG için H: Hibrit için kullanılacaktır.
         * - Arabanın yaşı ve yolculuğun KM si için 2 tam sayı değeri alın
         * - Kullanıcı L veya H girmez ise hata verin
         * - Toplam maliyet motor tipine göre hesaplanacaktır
         * - LPG 100km de 3.3lt
         * - HIBRIT 100km de 4.2lt
         * - LPG yakıtı 1.6₺ 1 litre için
         * - Aracın yaşı 7 den küçük ve eşit ise toplam maliyeti yazdırmanız yeterli
         * - Arabanın yaşı 7 den fazla ve 12 ye eşit ve küçük ise maliyet %3 arttırılmalı
         * - Arabanın yaşı 12 de n büyük ise toplam maliyet %7 arttırılmalıdır.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Aracınız LPG'li ise L, Hibrit ise H harfine basınız.");
        String yakit = sc.nextLine(); // Kullanıcıdan harf alınır.
        String yakitTuru = yakit.toUpperCase(); // kullanıcıdan alınan harf büyük harfe çevrilir.

        float LPGLitreFiyat = 0.0528F;
        float HibritLitreFiyat = 0.0672F; // hibrit liste fiyatı belirtilmediği için 1.6₺ olarak girilmiştir.
        float yol; //maaliyet değişkeni

        System.out.println("Lütfen aracınızın yaşını giriniz: ");
        int yas = sc.nextInt();
        System.out.println("Lütfen yolculuğun uzunluğunu KM cinsinden giriniz: ");
        int km = sc.nextInt();

        if (yakitTuru.equals("H")) {

            if ( yas <= 7){
                yol = km * HibritLitreFiyat;
                System.out.println("Yakıt Maaliyetiniz: " + yol);
            }
            else if (yas > 7 && yas <= 12){
                yol = (float) (km * HibritLitreFiyat * 1.3);
                System.out.println("Yakıt Maaliyetiniz: " + yol);
            }
            else if ( yas > 12){
                yol = (float) (km * HibritLitreFiyat * 1.7);
                System.out.println("Yakıt Maaliyetiniz: " + yol);
            }

        }
        else if (yakitTuru.equals("L")) {
            if (yas <= 7){
                yol = km * LPGLitreFiyat;
                System.out.println("Yakıt Maaliyetiniz: " + yol);
            }
            else if ( yas > 7 && yas <= 12){
                yol = (float) (km * LPGLitreFiyat * 1.3);
                System.out.println("Yakıt Maaliyetiniz: " + yol);
            }
            else if ( yas > 12){
                yol = (float) (km * LPGLitreFiyat * 1.7);
                System.out.println("Yakıt Maaliyetiniz: " + yol);
            }

        }
        else{
            System.out.println("HATALI GİRİŞ YAPTINIZ!");
        }

    }
}
