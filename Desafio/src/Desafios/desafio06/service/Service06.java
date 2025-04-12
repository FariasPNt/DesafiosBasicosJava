package Desafios.desafio06.service;

import Desafios.desafio06.domain.Desafio06;

import java.util.Locale;
import java.util.Scanner;
//6 - Faça um algoritmo que leia um valor qualquer
// e imprima na tela com um reajuste de 5%.
public class Service06 {
    public static void calcularDesafio06(Desafio06 desafio06){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Adicione um valor: ");
        double sum = input.nextDouble();
        desafio06.setValor(sum);
        double valorReajustado = desafio06.valorReajustado();
        System.out.println("Valor com reajuste: " + valorReajustado);
    }
}
