package Desafios.desafio07;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro valor (true/false): ");
        boolean valor1 = input.nextBoolean();
        System.out.print("Digite o segundo valor (true/false): ");
        boolean valor2 = input.nextBoolean();

        if ((valor1 && valor2) || (!valor1 && !valor2)) {
            System.out.println("Ambos os valores são iguais (VERDADEIRO ou FALSO).");
        } else {
            System.out.println("Os valores são diferentes.");
        }

        input.close();
    }
}
