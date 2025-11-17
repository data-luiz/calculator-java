package entities;

public class Calculator {

    public double number1;
    public double number2;
    public char operation;

    public double calculate() {

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
}
