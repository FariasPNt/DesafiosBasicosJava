package Desafios.desafio02.domain;

//2 - Faça um algoritmo para receber um número qualquer
//e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
public class AlgoritmoExe02 {
    protected int a;

    public void decidirParImpar(int a){
        if(a % 2 == 0){
            System.out.println("O número digitado é par");
        } else{
            System.out.println("O número digitado é impar");
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
