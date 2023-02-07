public class Sirul_Fibonacci_V2 {

    //  Sirul lui Fibonacci porneste de la N0 = 0 si N1 = 1. Se aduna cifra N si N+1 ca sa obtinem N+2 => N2 = N1+N0
//  deci Xn = Xn-1 + Xn-2 , iar "n" variaza de la 0 la infinit
//  Se tipareste cifrele N0, N1, N2, N3, N4, .......

    static int n1=0,n2=1,n3=0;

    static void printFibonacci(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibonacci(count-1);
        }
    }
    public static void main(String args[]){
        int count=20;
        System.out.print(n1+" "+n2);//printing 0 and 1
        printFibonacci(count-2);//n-2 because 2 numbers are already printed
    }


}
