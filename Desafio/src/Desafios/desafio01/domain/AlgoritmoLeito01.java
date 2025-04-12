package Desafios.desafio01.domain;

import java.util.Scanner;

//1 - Faça um algoritmo que leia os valores de A, B, C
//e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
public class AlgoritmoLeito01 {
    protected int a;
    protected int b;
    protected int c;

    public int somaDoisNumeros(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public void comparaDoisNumeros(int a, int b) {
        if (a > b) {
            System.out.println("O número " + a + " é maior que " + b);
        } else if (a == b) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("O número " + b + " é maior que o número " + a);
        }
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}

