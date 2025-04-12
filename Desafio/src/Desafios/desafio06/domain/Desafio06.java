package Desafios.desafio06.domain;
//6 - Faça um algoritmo que leia um valor qualquer
// e imprima na tela com um reajuste de 5%.
public class Desafio06 {
    public static final double REAJUSTE = 0.05;
    protected double valor;

    public double valorReajustado(){
        double sum = this.valor + (this.valor * REAJUSTE);
        return sum;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
