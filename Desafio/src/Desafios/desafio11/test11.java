package Desafios.desafio11;

import java.util.Scanner;

//11 - Faça um algoritmo que leia quatro notas obtidas por um aluno,
// calcule a média das nota obtidas, imprima na tela o nome do aluno e
//se o aluno foi aprovado ou reprovado.
// Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
public class test11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o aluno: ");
        String aluno = input.nextLine();
        System.out.println("Primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.println("Segunda nota: ");
        double nota2 = input.nextDouble();
        System.out.println("Terceira nota: ");
        double nota3 = input.nextDouble();
        System.out.println("Quarta nota: ");
        double nota4 = input.nextDouble();
        double result = (nota1+nota2+nota3+nota4) / 4;
        System.out.println("Aluno: "+aluno);
        if(result > 7){
            System.out.println("Aprovado com media "+result);
        } else{
            System.out.println("Reprovado com media "+result);
        }
    }

}
