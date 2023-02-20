package Java_E1;

import java.util.Scanner;

public class Calculator_numeric {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

//  citim urmatoarele valori de natura Double() introduse de la tastatura
        double first = reader.nextDouble();
        double second = reader.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);
        double result;

//  mutam cazul pentru fiecare dintre cei 2 operatori
        switch(operator)
        {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;

//  alegem operatorul pe care dorim sa-l utilizam (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

//  tiparim rezultatul operatiei efectuate
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }


}
