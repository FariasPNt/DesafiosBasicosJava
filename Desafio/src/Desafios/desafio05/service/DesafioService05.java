package Desafios.desafio05.service;

import Desafios.desafio05.domain.DesafioDomain05;

import java.util.Scanner;

//5 - Faça um algoritmo que leia o valor do salário mínimo
// e o valor do salário de um usuário, calcule quantos salários mínimos esse
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
public class DesafioService05 {
    public static void calcularSalarioMinimo(DesafioDomain05 desafioDomain05){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário");
        double num = input.nextDouble();
        desafioDomain05.setSalario(num);
        double result = desafioDomain05.calcValorSalario();
        System.out.println("Quantidade de salários minimos: " + result);
    }
}
