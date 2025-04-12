package Desafios.desafio22;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

//22 - Faça um algoritmo que leia dois valores inteiros A e B,
// imprima na tela o quociente e o resto da divisão inteira entre eles.
public class DivisaoEntreNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = input.nextInt();
        int quociente = num1 / num2;
        int resto = num1 % num2;
        System.out.println("Quociente da divisão entre os dois números: " + quociente);
        System.out.println("Resto da divisão entre os dois números: " + resto);
    }
}
