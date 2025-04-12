package Desafios.desafio01.service;

import Desafios.desafio01.domain.AlgoritmoLeito01;

import java.util.Scanner;
//1 - Faça um algoritmo que leia os valores de A, B, C (FEITO)
//e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

public class CalculandoResultado{
    public static void calcularResultadoExe(AlgoritmoLeito01 algoritmo){
        Scanner input = new Scanner(System.in);
        System.out.println("Number A: ");
        int numA = input.nextInt();
        algoritmo.setA(numA);
        System.out.println("Number B: ");
        int numB = input.nextInt();
        System.out.println("Number C: ");
        int numC = input.nextInt();

        int numD = algoritmo.somaDoisNumeros(numA, numB);
        System.out.println("Resultado da soma dos números A e B: "+ numD);
        algoritmo.comparaDoisNumeros(numD, numC);
    }


}
