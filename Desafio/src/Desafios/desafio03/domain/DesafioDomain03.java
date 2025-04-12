package Desafios.desafio03.domain;
//3 - Faça um algoritmo que leia dois valores inteiros A e B,
//se os valores de A e B forem iguais, deverá somar os dois valores,
//caso contrário devera multiplicar A por B.
//Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C
// e imprimir seu valor na tela.
public class DesafioDomain03 {
    protected int a;
    protected int b;

    public int calcularResultado(int a, int b){
        if(a == b){
            int c = a+b;
            return c;
        } else{
            int c = a * b;
            return c;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
