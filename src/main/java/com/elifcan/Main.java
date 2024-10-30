package com.elifcan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Bir kişinin öğrencilik süresini alıp hangi okul döneminde olduğunu söyleyen kodu yazınız.
         * <5. “Elemantary School”
         * 5<= gradle <8 ”Junior School”
         * 8<= gradle <10 “High School”
         * >=10 “College”
         * <0 “NONE”
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your education time as year: ");

        int sure = sc.nextInt(); //Öğrencilik süresi tamsayı olduğu için int olarak alındı.

        if (sure < 0) {
            System.out.println("NONE");
        }
        else if (sure < 5) {
            System.out.println("Elemantary School");
        }
        else if (sure >= 5 && sure < 8) {
            System.out.println("Junior School");
        }
        else if (sure >= 8 && sure < 10) {
            System.out.println("High School");
        }
        else if (sure >= 10) {
            System.out.println("College");
        }

    }
}