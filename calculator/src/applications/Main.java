package applications;

import entities.Calculator;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double number1 = sc.nextDouble();

        System.out.println("Escolha a operação (+, -, *, /):");
        char operation = sc.next().charAt(0);

        System.out.println("Digite o segundo número:");
        double number2 = sc.nextDouble();

        double result = Calculator.calculate(number1, operation, number2);

        printResult(result);

        sc.close();
    }

    public static void printResult(double result) {
        if (!Double.isNaN(result)) {
            System.out.printf("Resultado é: %.2f%n", result);
        } else {
            System.out.println("Cálculo não pôde ser realizado devido a um erro.");
        }
    }
}
