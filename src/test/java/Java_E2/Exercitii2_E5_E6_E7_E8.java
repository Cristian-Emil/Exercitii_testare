package Java_E2;

import java.util.Scanner;

public class Exercitii2_E5_E6_E7_E8 {

        public static void main(String[] args) {
//      exe5();
//      exe6();
//      exe7();
//      exe8();
        }
// aici incepe exe5 ---------------------------------------------------------------------------------------------------
        static void exe5() {
            System.out.println("Afisam 3 marimi diferite");
            int a = 10;
            String b = "Cal si caruta";
            boolean c = true;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(" ");
        }
// aici incepe exe6 ---------------------------------------------------------------------------------------------------
        static void exe6() {
            System.out.println("Introducti valoarile Nr.1 & Nr.2 de la tastatura");
            Scanner numar1 = new Scanner(System.in);
            double nr1 = numar1.nextDouble();
            System.out.println("Am introdus primul numar");
            Scanner numar2 = new Scanner(System.in);
            double nr2 = numar2.nextDouble();
            System.out.println("Am introdus al doilea numar");
            System.out.println("Primul numar este =  " + nr1);
            System.out.println("Al doilea numar este =  " + nr2);
            System.out.println(" ");
        }
// aici incepe exe7 ---------------------------------------------------------------------------------------------------
        static void exe7() {
            System.out.println("Introducti valoarea lui A de la tastatura");
            Scanner A = new Scanner(System.in);
            int A1 = A.nextInt();
            System.out.println("Am introdus numar A");
            int X1 = A1 + 5;
            System.out.println("Adunam cu 5 si rezulatatul este =  " + X1);
            double X2 = (double)A1 - 12.3;
            System.out.println("Scadem 12,3 din nr si rezultatul  =  " + X2);
            double X3 = (double)A1 * -3.2;
            System.out.println("Inmultim cu -3,2 si rezulatatul este =   " + X3);
            double X4 = (double)(A1 / 4);
            System.out.println("Impartim la patru si luam intregul iar rezulatatul este =  " + X4);
            int X5 = A1 % 6;
            System.out.println("Modul cu 6 iar rezulatatul este =  " + X5);
            System.out.println(" ");
        }
// aici incepe exe8 ---------------------------------------------------------------------------------------------------
        static void exe8() {
            System.out.println("Stergeti un comment ca sa avem 12 si 2 rezultate finale");
            int x = 2;
            int y = 12;
            y += x;
            x = y - x;
            y -= x;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
}
