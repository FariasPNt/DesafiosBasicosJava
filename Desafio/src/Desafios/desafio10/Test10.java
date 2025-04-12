package Desafios.desafio10;

import java.util.Scanner;

//10 - Faça um algoritmo que leia três notas obtidas por um aluno,
// e imprima na tela a média das notas.
public class Test10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Primeira nota: ");
        double um = input.nextDouble();
        System.out.println("Segunda nota: ");
        double dois = input.nextDouble();
        System.out.println("Terceira nota: ");
        double tres = input.nextDouble();

        double sum = um + dois + tres;
        double result = sum / 3;
        System.out.println("Média: "+ result);
    }
}
