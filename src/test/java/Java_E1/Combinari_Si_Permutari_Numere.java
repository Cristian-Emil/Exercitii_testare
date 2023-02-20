package Java_E1;

import java.util.Scanner;

public class Combinari_Si_Permutari_Numere {

//  Calculam un numar factoriaL
    public static int fact(int numar)
    {
        int fact=1, i;
        for(i=1; i<=numar; i++)
        {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        int n, m;
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduceti valoarea lui n : ");
        n = scan.nextInt();
        System.out.print("Introduceti valoarea lui m : ");
        m = scan.nextInt();
// NCR and NPR of a number
        System.out.print("NCR = " +(fact(n)/(fact(n-m)*fact(m))));
        System.out.print("\n");
        System.out.print("nNPR = " +(fact(n)/(fact(n-m))));
    }

}
