package Desafios.desafio04.service;

import Desafios.desafio04.domain.DesafioDomain04;

import java.util.Scanner;
//4 - Faça um algoritmo que receba um número inteiro
// e imprima na tela o seu antecessor e o seu sucessor.
public class DesafioService04 {
    public static void calcularDesafio(DesafioDomain04 desafioDomain04){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = input.nextInt();
        desafioDomain04.setA(num);
        int num2 = desafioDomain04.antecessor(num);
        int num3 = desafioDomain04.sucessor(num);
        System.out.println("Antecessor: "+num2);
        System.out.println("Sucessor: "+num3);
    }
}
