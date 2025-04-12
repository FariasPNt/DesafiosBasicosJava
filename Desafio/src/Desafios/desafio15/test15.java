package Desafios.desafio15;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o dia do seu nascimento: ");
        int dia = input.nextInt();
        System.out.println("Digite o mês: ");
        int mes = input.nextInt();
        System.out.println("Digite o ano: ");
        int ano = input.nextInt();

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();

        Period idade = Period.between(dataNascimento, hoje);

        System.out.println("Idade: " + idade.getYears() + " anos, " + idade.getMonths()+" meses e " + idade.getDays() + " dias.");
    }
}
