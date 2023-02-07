import java.util.Scanner;

public class Sirul_Polidrom {

    static void checkPalindrom(String input) {

//  Pornim de la presupunerea ca rezultatul e ADEVARAT
        boolean rez = true;
        int length = input.length();

//  Impartim lungimea sirului la 2 si efectuam comparatia.
        for(int i=0; i<= length/2; i++) {
            if(input.charAt(i) != input.charAt(length-i-1)) {
                rez = false;
                break;
            }
        }
        System.out.println(input + " este palindrom = "+rez);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti datele : ");
        String stry = sc.nextLine();

//  Chemam functia
        checkPalindrom(stry);
    }




}
