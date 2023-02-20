package Java_E1;

public class Sirul_Fibonacci_V1 {

//  Sirul lui Fibonacci porneste de la N0 = 0 si N1 = 1. Se aduna cifra N si N+1 ca sa obtinem N+2 => N2 = N1+N0
//  deci Xn = Xn-1 + Xn-2 , iar "n" variaza de la 0 la infinit
//  Se tipareste cifrele N0, N1, N2, N3, N4, .......


    public static void main(String args[]) {
/*  putem sa definim varaibilele :
    int n1 = 0;
    int n2 = 1;
    int n3, i, count = 10;

sau definim ca in linia de mai jos
 */
        int n1 = 0, n2 = 1, n3, i, count = 1;

        System.out.print(n1 + " " + n2);//printing 0 and 1

        for (i = 2; i < count; ++i)// ciclul porneste de la cifra 2 adica n3 pt ca primele 2 cifre exista , adica n1=0 si n2=1
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

}
