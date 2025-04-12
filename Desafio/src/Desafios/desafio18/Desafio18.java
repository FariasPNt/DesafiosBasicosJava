package Desafios.desafio18;
//18 - Francisco tem 1,50m e cresce 2 centímetros por ano,
// enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
// Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários
// para que Francisco seja maior que Sara.
public class Desafio18 {
    public static void main(String[] args) {
        double francisco = 1.5;
        double sara = 1.1;
        double cresce_sara = 0.03;
        double cresce_francisco = 0.02;
        int contador = 0;

        while (sara <= francisco) {
            sara += cresce_sara;
            francisco += cresce_francisco;
            contador++;
        }

        System.out.printf("Altura de Sara: %.2f m\n", sara);
        System.out.printf("Altura de Francisco: %.2f m\n", francisco);
        System.out.println("Anos até Sara ultrapassar Francisco: " + contador);
    }
}

