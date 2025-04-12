package Desafios.desafio12;

import Desafios.desafio09.domain.Domain09;

import java.util.Scanner;

// 12 - Faça um algoritmo que leia o valor de um produto
// e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
//pelo comprador e imprima na tela o valor final do produto a ser pago.
// Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
//Tabela de Código de Condições de Pagamento
// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
public class test12 {
    public static void main(String[] args) {
        Domain12 domain12 = new Domain12();
        Scanner input = new Scanner(System.in);
        System.out.println("Valor do produto: ");
        double valor = input.nextDouble();
        domain12.setValor(valor);
        System.out.println("Qual forma de pagamento: \n1: (a vista)\n2: " +
                "(a vista cartao credito)\n3: (parcelado 2 vezes)\n4: (parcelado 3 vezes) ");
        int escolha = input.nextInt();
        if (escolha == 1) {
            domain12.setFormaPagamento(FormaPagamento.avistaPix);
        } else if (escolha == 2) {
            domain12.setFormaPagamento(FormaPagamento.avistaCredito);
        } else if (escolha == 3) {
            domain12.setFormaPagamento(FormaPagamento.parceladoDuas);
        } else if (escolha == 4) {
            domain12.setFormaPagamento(FormaPagamento.parceladoTres);
        } else {
            System.out.println("Opção inválida");
        }

        double total = domain12.valorFinal();
        System.out.println("Valor total: " + total);
    }
}
