package Desafios.desafio24;

import java.util.Scanner;

//Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem,
// sabendo que o carro faz 12km com um litro.
// Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média,
// distância percorrida e a quantidade de litros utilizados para fazer a viagem.
//Fórmula: distância = tempo x velocidade.
//litros usados = distância / 12.
public class GastoGasolinaViagem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tempo da viagem: ");
        double tempo = input.nextDouble();
        System.out.println("Velocidade media durante a viagem: ");
        double velocidade = input.nextDouble();
        double distancia = tempo * velocidade;
        double litros = distancia / 12;

        System.out.println("Tempo de viagem: "+tempo+"h");
        System.out.println("Velocidade media: "+velocidade+"km");
        System.out.println("Distancia da viagem: "+distancia+"km");
        System.out.printf("Quantidade de litros usado: %.2f litros\n",litros);

    }
}
