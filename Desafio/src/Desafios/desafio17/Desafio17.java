package Desafios.desafio17;

//17 - Faça um algoritmo que leia uma temperatura em Fahrenheit
// e calcule a temperatura correspondente em grau Celsius.
// Imprima na tela as duas temperaturas.
//Fórmula: C = (5 * ( F-32) / 9)

import java.util.Scanner;

public class Desafio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double tem1 = input.nextInt();
        double calc = (5 * (tem1 - 32)) / 9;
        System.out.println("Temperatura em Celsius: " + calc);
    }
}
