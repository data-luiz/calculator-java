package entities;

public final class Calculator {

    private Calculator() {}

    public static double calculate(double number1, char operation, double number2) {
        switch (operation) {
            case '+': return number1 + number2;
            case '-': return number1 - number2;
            case '*': return number1 * number2;
            case '/': return number2 == 0 ? Double.NaN : number1 / number2;
            default:
                System.out.println("Erro: Operação inválida.");
                return Double.NaN;
        }
    }
}
