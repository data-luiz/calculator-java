import java.util.Scanner;

// calculator java project

public class Main {

    // Função principal e entrada de dados.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double number1 = sc.nextDouble();

        System.out.println("Escolha a operação (+, -, *, /):");
        char operation = sc.next().charAt(0);

        System.out.println("Digite o segundo número:");
        double number2 = sc.nextDouble();

        printResult(calculate(number1, number2, operation));

        sc.close();
    }

    // Função para realizar o cálculo.
    public static double calculate(double number1, double number2, char operation) {
        switch (operation) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                if (number1 != 0 && number2 != 0) {
                    return number1 / number2;
                }
                else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return Double.NaN;
                }
                default:
                System.out.println("Erro: Operação inválida.");
                return Double.NaN;
        }
    }

    // Função para mostrar o resultado.
    public static void printResult(double result) {
        if (!Double.isNaN(result)) {
            System.out.printf("Resultado é: %.2f%n", result);
        }
        else {
            System.out.println("Cálculo não pôde ser realizado devido a um erro.");
        }
    }
}