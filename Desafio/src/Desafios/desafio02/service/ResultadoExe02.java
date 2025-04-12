package Desafios.desafio02.service;

import Desafios.desafio02.domain.AlgoritmoExe02;

import java.util.Scanner;
//2 - Faça um algoritmo para receber um número qualquer
//e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
public class ResultadoExe02 {
    public static void exibirResultado(AlgoritmoExe02 algoritmoExe02){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = input.nextInt();
        algoritmoExe02.setA(num);
        algoritmoExe02.decidirParImpar(num);
    }
}
