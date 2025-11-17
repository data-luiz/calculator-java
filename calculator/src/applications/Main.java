package applications;

import entities.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculator calculate = new Calculator();

        System.out.println("Digite o primeiro número:");
        calculate.number1 = sc.nextDouble();

        System.out.println("Escolha a operação (+, -, *, /):");
        calculate.operation = sc.next().charAt(0);

        System.out.println("Digite o segundo número:");
        calculate.number2 = sc.nextDouble();

        double result = calculate.calculate();
        printResult(result);

        sc.close();
    }

    public static void printResult(double result) {
        if (!Double.isNaN(result)) {
            System.out.printf("Resultado é: %.2f%n", result);
        }
        else {
            System.out.println("Cálculo não pôde ser realizado devido a um erro.");
        }
    }
}