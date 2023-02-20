package Java_E2;

import java.util.Scanner;

public class Exercitii1_E1_E2_E3_E4 {

        public static void main(String[] args) {
//          exe1();
//          exe2();
//          exe3();
//          exe4();
        }
// aici incepe exe1 ---------------------------------------------------------------------------------------------------
        static void exe1() {
            System.out.println("Punctul 1 - tipariti textul");
            System.out.println("De 3 ori TRAIASCA si la final URA! , \n");
        }
// aici incepe exe2 ---------------------------------------------------------------------------------------------------
        static void exe2() {
            System.out.println("Punctul 2 - tipariti textul de 7 ori");

            for(int i = 0; i < 7; ++i) {
                System.out.println("Java e fain! tiparit de 7 ori");
            }

            System.out.println(" ");
        }
// aici incepe exe3 ---------------------------------------------------------------------------------------------------
        static void exe3() {
            System.out.println("Punctul 3 - Calculeaza varsta lui David");
            int Dif_ani = 6;
            int Varsta_Ana = 24;
            System.out.println("Ana are " + Varsta_Ana + " ani.");
            int David = Varsta_Ana - Dif_ani;
            System.out.println("David are " + David + " ani!  \n");
        }
// aici incepe exe4 ---------------------------------------------------------------------------------------------------
        static void exe4() {
            System.out.println("Punctul 4 - Citim textul introdus de la tastatura");
            Scanner introducere = new Scanner(System.in);
            String a = introducere.nextLine();
            System.out.println("Citim textul de la tastatura =  " + a);
        }

}
