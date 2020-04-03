/*
GIRIRLEN BOUNDRYLER ARASINDAKI SAYILARDA ISTENILEN SAYININ KATLARINI BULMA
 */
package javaapplication9;


import java.util.*;

public class JavaApplication9 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x1, x2, x3, t, i;
        String a;
        
        do {
            System.out.print("Birinci sayiyi giriniz = ");
            x1 = input.nextInt();
            System.out.print("ikinci sayiyi girin = ");
            x2 = input.nextInt();
            while (x2 < x1) {
                t = x2;
                x2 = x1;
                x1 = t;
            }
            System.out.print("Kaca bolunen sayilari bulmak istiyorsunuz? = ");
            x3 = input.nextInt();
            for (i = x1; i <= x2; i++) {
                t = i % x3;
                if (t == 0) {
                    System.out.println(Integer.toString(i) + " sayisi " + x3 + " ile bolunur");
                }
            }
            do {
                System.out.print("tekrar yapmak istiyor musunuz? (y, n) : ");
                a = input.nextLine();
            } while (!a.equals("y") && !a.equals("n") && !a.equals("Y") && !a.equals("N"));
        } while (!a.equals("n") && !a.equals("N"));
    }
}
