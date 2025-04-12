package Desafios.desafio14;

import java.util.Scanner;

//14 - Faça um algoritmo que receba um valor A e B,
// e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
public class Desafio14 {
    public static void main(String[] args) {
        Domain14 domain = new Domain14();
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor de A: ");
        int numA = input.nextInt();
        System.out.println("Insira o valor de B: ");
        int numB = input.nextInt();
        domain.setA(numB);
        domain.setB(numA);
        System.out.println("Numero A " + domain.getA());
        System.out.println("Numero B " + domain.getB());
    }
}
