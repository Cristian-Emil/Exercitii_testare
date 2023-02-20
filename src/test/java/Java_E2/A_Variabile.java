package Java_E2;

public class A_Variabile {

//  Definim si tiparim o variabila

    public static void main(String[] args) {
//        System.out.println("Salut lume!");
        // tot ce incepe cu '//" o sa fie ignorat de sistem si considerat invizibil

        int A; // am declarat o variabila dar nu a fost initializata
        A=10; // variabila a fost intitalizata
        System.out.println(A);

        byte B = 127; // aceasta e valaorea maxima pt un bite
        short C = 315;

        String text = "Astfel se scrie un text in JAVA";
        System.out.println(text.toUpperCase()); // el tipareste cu litere mari
        System.out.println(text.toLowerCase(). contains ("java")); // el tipareste cu litere mari

    }

}