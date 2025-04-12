package Desafios.desafio08.test;

import Desafios.desafio08.domain.Domain08;

import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {
        Domain08 domain = new Domain08();
        Scanner input = new Scanner(System.in);
        System.out.println("Adicione o valor de a: ");
        int um = input.nextInt();
        System.out.println("Adicione o valor de b: ");
        int dois = input.nextInt();
        System.out.println("Adicione o valor de c: ");
        int tres = input.nextInt();
        domain.setA(um);
        domain.setB(dois);
        domain.setC(tres);
        domain.ordemDec();

    }
}
