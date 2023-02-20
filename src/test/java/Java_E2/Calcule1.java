package Java_E2;

import java.util.Scanner;

public class Calcule1 {

     public static void main(String[] arg) {
        Scanner adunarea_2_nr = new Scanner(System.in);
        System.out.println("Introducem valoarea X = ");
        int x = adunarea_2_nr.nextInt();
         adunarea_2_nr.nextLine();
        System.out.println("Introducem valoarea Y = ");
        int y = adunarea_2_nr.nextInt();
         adunarea_2_nr.nextLine();
        System.out.println("X = " + x + ";  Y = " + y);
        int suma = adunarea_2_nr(x, y);
        System.out.println("Suma = " + suma);
        int inmultirea = inmultirea_2_nr(x,y);
        System.out.println("Imnultirea = " + inmultirea);
    }
    static int adunarea_2_nr(int n1, int n2) {
        return n1 + n2;
    }
    static int inmultirea_2_nr(int n1, int n2) {
        return n1 * n2;
    }

}

