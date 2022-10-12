// Comparando inteiros utilizando instruções if, operadores relacionais e operadores de igualdade.
package ch02;

import java.util.Scanner;

public class Comparison {

    // Método main inicia a execução do aplicativo Java
    public static void main(String[] args) {

        // Cria Scanner para obter entrada a partir da ilnha de comando
        Scanner input = new Scanner(System.in);

        int number1; // Primeiro número a comparar
        int number2; // Segundo número a comparar

        System.out.print("Enter first integer: "); // Prompt
        number1 = input.nextInt(); // Lê o primeiro número fornecido pelo usuário

        System.out.print("Enter first integer: "); // Prompt
        number2 = input.nextInt(); // Lê o segundo número fornecido pelo usuário

        if (number1 == number2) {
            System.out.printf("%d == %d%n", number1, number2);
        }

        if (number1 != number2) {
            System.out.printf("%d != %d%s", number1, number2);
        }

        if (number1 < number2) {
            System.out.printf("%d < %d%s", number1, number2);
        }

        if (number1 > number2) {
            System.out.printf("%d > %d%n", number1, number2);
        }

        if (number1 <= number2) {
            System.out.printf("%d <= %d%n", number1, number2);
        }

        if (number1 >= number2) {
            System.out.printf("%d >= %d%n", number1, number2);
        }
    } // Fim do Método main
} // Fim da classe Comparison
