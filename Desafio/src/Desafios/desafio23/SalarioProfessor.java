package Desafios.desafio23;

import java.util.Scanner;

//Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
// As informações fornecidas serão: valor da hora aula,
// número de aulas lecionadas no mês e percentual de desconto do INSS.
// Imprima na tela o salário líquido final.
public class SalarioProfessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor da hora aula: ");
        double horaAula = input.nextDouble();
        System.out.println("Números de aula lecionadas");
        int numAulas = input.nextInt();
        System.out.println("Percentual de desconto do INSS (Sem o %): ");
        double descontoINSS = input.nextDouble();

        double percentual = descontoINSS / 100;
        double salarioBruto = horaAula * numAulas;
        double valorDesconto = salarioBruto * percentual;
        double salarioLiquido = salarioBruto - valorDesconto;
        System.out.println("Salário Bruto: "+salarioBruto);
        System.out.println("Desconto do INSS: " + descontoINSS);
        System.out.println("Porcentagem do Desconto: "+percentual);
        System.out.println("Valor do Desconto: "+valorDesconto);
        System.out.println("Salário Liquido: "+salarioLiquido);

    }
}
