package Desafios.desafio21;

import java.util.Scanner;

//Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
public class ValorAleatorio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Adicione um valor de 0 a 100: ");
        int num = input.nextInt();
        if(num <= 0 || num >= 100){
            System.out.println("Numéro inválido favor adicionar um número entro 0 e 100");
        } else{
            System.out.println("Numero: "+num);
        }
    }

}
