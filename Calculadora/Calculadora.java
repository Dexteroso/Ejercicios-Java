package Calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        char operador;
        double num1, num2, resultado = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa el operador que deseas (+, -, *, /)");
        operador = entrada.next().charAt(0);

        System.out.println("Ingresa el primer número:");
        num1 = entrada.nextDouble();

        System.out.println("Ingresa el segundo número:");
        num2 = entrada.nextDouble();

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operador Inválido");
                break;
        }

        System.out.println("El resultado es " + resultado);
        
        entrada.close();
    }
}