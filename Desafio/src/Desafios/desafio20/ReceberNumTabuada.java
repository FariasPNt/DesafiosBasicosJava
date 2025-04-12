package Desafios.desafio20;

import java.util.Scanner;

//20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
public class ReceberNumTabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Adicione um valor: ");
        int tab = input.nextInt();
        for (int i = 1; i < 10; i++) {
            int sum = i * tab;
            System.out.println(tab+"x"+i+"="+sum);
        }
    }
}
