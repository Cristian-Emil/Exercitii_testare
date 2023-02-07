import java.util.Scanner;

public class Calcul_factorial {

    public static void main(String args[]){

//  Utilizam comanda SCANNER ca sa facem captura la valoarea introdusa
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");

//  Stocam valoarea in cadrul unei variabile
        int num = scanner.nextInt();

//  Chemam functia definita
        int factorial = fact(num);
        System.out.println("Factorial of entered number is: "+factorial);
    }
    static int fact(int n)
    {
        int output;
        if(n==1){
            return 1;
        }
//  Functei recurenta - functia se autocalculeaza dupa initializarea programului :
//  S = N * N-1 * N-2 * N-3 * ... * 1
        output = fact(n-1)* n;
        return output;
    }

}
