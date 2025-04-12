package Desafios.desafio13;

import java.util.Scanner;

//Faça algoritmo que leia o nome e a idade de uma peso
// e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
public class Test13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();
        System.out.println(nome);
        if(idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
}

