package Desafios.desafio03.service;

import Desafios.desafio03.domain.DesafioDomain03;

import java.util.Scanner;

//3 - Faça um algoritmo que leia dois valores inteiros A e B,
//se os valores de A e B forem iguais, deverá somar os dois valores,
//caso contrário devera multiplicar A por B.
//Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C
// e imprimir seu valor na tela.
public class DesafioService03 {
    public static void calcularResultado(DesafioDomain03 desafioDomain03) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num = input.nextInt();
        desafioDomain03.setA(num);
        System.out.println("Digite o segundo número: ");
        int num2 = input.nextInt();
        desafioDomain03.setB(num2);
        int num3 = desafioDomain03.calcularResultado(num, num2);
        System.out.println("Resultado do calculo: " + num3);
    }
}
