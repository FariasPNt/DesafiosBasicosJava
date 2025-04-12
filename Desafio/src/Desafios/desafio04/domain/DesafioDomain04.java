package Desafios.desafio04.domain;

//4 - Faça um algoritmo que receba um número inteiro
// e imprima na tela o seu antecessor e o seu sucessor.
public class DesafioDomain04 {
    protected int a;

    public int antecessor(int a){
        return a -1;
    }
    public int sucessor(int a){
        return a + 1;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
