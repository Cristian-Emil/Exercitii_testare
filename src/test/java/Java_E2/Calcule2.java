package Java_E2;

import java.util.Scanner;

public class Calcule2 {

    public static void main(String[] args) {
        System.out.println("introducem numarul fractionar_1");
        Scanner scanner = new Scanner(System.in);
        double numarul1 = scanner.nextDouble();
        System.out.println("introducem numarul fractionar_2:");
        double numarul2 = scanner.nextDouble();
        double rez_inmultim = inmultim(numarul1, numarul2);
        double rez_adunam = adunam(numarul1, numarul2);
        double rez_scadem = scadem(numarul1, numarul2);
        double rez_impartim = impartim(numarul1, numarul2);
        double rez_modul = (double)modul((int)numarul1, (int)numarul2);
        double random = generam_nr_aleatoriu(rez_scadem, rez_inmultim);
        System.out.println("rez_inmultire = " + rez_inmultim);
        System.out.println("rez_adunare = " + rez_adunam);
        System.out.println("rez_scadere = " + rez_scadem);
        System.out.println("rez_impartire = " + rez_impartim);
        System.out.println("rez_modul = " + rez_modul);
        System.out.println("rez_nr_aleatoriu intre " + rez_scadem + " si " + rez_inmultim + " este = " + random);
    }
    public static double inmultim(double nr1, double nr2) {
        double rez = nr1 * nr2;
        return rez;
    }
    public static Double adunam(double numarul1, double nr2) {
        double rez = numarul1 + nr2;
        return rez;
    }
    public static Double scadem(Double numarul1, Double numarul2) {
        double rez = numarul1 - numarul2;
        return rez;
    }
    public static Double impartim(Double numarul1, double numarul2) {
        return numarul1 / numarul2;
    }
    public static int modul(int nr1, int nr2) {
        return nr1 % nr2;
    }
    public static double generam_nr_aleatoriu(double minim, double maxim) {
        return Math.random() * (maxim - minim) + minim;
    }
}



