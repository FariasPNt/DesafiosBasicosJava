package Desafios.desafio16;

import java.util.Scanner;

//16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo
// e verifique se são válidos, determine se o triângulo é
//equilátero, isósceles ou escaleno.
public class test16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Domain16 domain = new Domain16();
        System.out.println("Digite o primeiro lado: ");
        int lado1 = input.nextInt();
        System.out.println("Segundo lado: ");
        int lado2 = input.nextInt();
        System.out.println("Terceiro lado: ");
        int lado3 = input.nextInt();
        domain.setA(lado1);
        domain.setB(lado2);
        domain.setC(lado3);

        if(domain.trianguloValido(lado1, lado2, lado3)){
            domain.classificacaoTriangulo(lado1, lado2, lado3);
        } else{
            System.out.println("Triangulo inválido");
        }

    }
}
