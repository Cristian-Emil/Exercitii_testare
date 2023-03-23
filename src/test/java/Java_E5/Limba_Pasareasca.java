package Java_E5;
import java.util.Scanner;
public class Limba_Pasareasca {

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println(este_vocala('b'));
        System.out.print("Tastati unul sau mai multe cuvante pt. o traducere in PASAREASCA  : ");
        final String userInput = scan.nextLine();
        scan.close();
        String raspuns = cauta_Limba_Pasareasca(userInput);
        System.out.println(raspuns);
        }

    public static boolean este_vocala(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }

    public static String cauta_Limba_Pasareasca(String input) {

        String raspuns = " ";                                           // initializeara raspuns, iteram prin caractere
        int i;
        for (i = 0; i < input.length(); i++) {
            if (este_vocala(input.charAt(i))) {
                raspuns = input.substring(i);
                break;
            }
        }
        if (i == input.length()) {
            return "Nu ai un raspuns";
        }
        // se ia tot ce e inaintea vocalei si se muta conform cerintei
        raspuns = raspuns + input.substring(0,i);
        raspuns += "ay";
        return raspuns;
    }
}