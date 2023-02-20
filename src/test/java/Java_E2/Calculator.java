package Java_E2;

import java.util.Scanner;

public class Calculator {

   public static void main(String[] args) {

   int x;
   int y;

   Scanner scanner = new Scanner(System.in); // citeste inputul de la tastatura
   System.out.println("Introduceti valoarea lui x:");
   x = scanner.nextInt();
   scanner.nextLine();
   System.out.println("Introduceti valoarea lui y:");
   y = scanner.nextInt();
   scanner.nextLine();
   System.out.println("x = " + x + " y = " + y);

   System.out.println("Suma este = " + SumaDouaNumere(x,y));
}

   static int SumaDouaNumere( int x, int y){
       return x + y;
   }

}
