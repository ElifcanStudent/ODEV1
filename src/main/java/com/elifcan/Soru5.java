package com.elifcan;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        /**
         * Elimizde şöyle bir liste var, bu listeden şehir seçildiğinde ilgili şehirin plaka numarasını veren kodu yazınız.
         *
         * 01- Adana
         * 02- Adıyaman
         * 03- Ayfon
         * 10- Balıkesir
         * 11- Bilecik
         * 12- Bingöl
         * 13- Bitlis
         * 20- Denizli
         *
         * Yukarıda verilen plaka kodlarını kullanacaksınız.
         *
         * Örn:
         * Şehir adını giriniz: ADANA
         * Plaka: 01
         *
         * Örn
         * Şehir adını giriniz: BiTLis
         * Plaka: 13
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Şehir adını giriniz: ");
        String ad = sc.nextLine();
        String sehir = ad.toUpperCase();

        for (int i = 0; i < sehir.length(); i++) {
            if (sehir.charAt(i) == 'İ') {
                sehir = sehir.replace("İ","I");
            }
        }
        for (int i = 0; i < sehir.length(); i++) {
            if (sehir.charAt(i) == 'Ö') {
                sehir = sehir.replace("Ö", "O");
            }
        }

        switch (sehir){
            case "ADANA":
                System.out.println("Araç Plakası: 01");
                break;
            case "ADIYAMAN":
                System.out.println("Araç Plakası: 02");
                break;
            case "AFYON":
                System.out.println("Araç Plakası: 03");
                break;
            case "BALIKESIR":
                System.out.println("Araç Plakası: 10");
                break;
            case "BILECIK":
                System.out.println("Araç Plakası: 11");
                break;
            case "BINGOL":
                System.out.println("Araç Plakası: 12");
                break;
            case "BITLIS":
                System.out.println("Araç Plakası: 13");
                break;
            case "DENIZLI":
                System.out.println("Araç Plakası: 20");
                break;
            default:
                System.out.println("Geçersiz giriş yaptınız.");
        }

    }
}
