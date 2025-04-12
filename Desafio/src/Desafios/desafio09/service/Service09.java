package Desafios.desafio09.service;

import Desafios.desafio09.domain.Domain09;

import java.util.Locale;
import java.util.Scanner;

//9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa,
// leia o seu peso e sua altura e imprima na tela sua condição
//de acordo com a tabela abaixo:
//Fórmula do IMC = peso / (altura) ²
//Tabela Condições IMC
//Abaixo de 18,5   | Abaixo do peso
//Entre 18,6 e 24,9 | Peso ideal (parabéns)
//Entre 25,0 e 29,9 | Levemente acima do peso
//Entre 30,0 e 34,9 | Obesidade grau I
//Entre 35,0 e 39,9 | Obesidade grau II (severa)
//Maior ou igual a 40 | Obesidade grau III (mórbida)
public class Service09 {
    public static void calcResult09(Domain09 domain){
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Adicione o seu peso: ");
        double peso = input.nextDouble();
        System.out.println("Adicione a sua altura: ");
        double altura = input.nextDouble();
        domain.setPeso(peso);
        domain.setAltura(altura);
        double result = domain.calcularIMC();
        domain.resultadoIMC(result);
    }
}
