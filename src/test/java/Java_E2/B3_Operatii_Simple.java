package Java_E2;

public class B3_Operatii_Simple {
    public static void main(String[] args) {
        System.out.println("Tiparim rezultatul inmultirii unui nr. cu el insusi si de 2 ori");
        int X1 = 12;
        System.out.println("X1 = " + X1);
        System.out.println("Rezulatatul este A = " + A(X1));
        System.out.println("Rezulatatul este B = " + B(X1));
        }
        static int A(int numar) {
            int A = numar * numar;
        return A;
        }
        static int B(int numar) {
            int B = numar * numar * numar;
        return B;
    }
}
