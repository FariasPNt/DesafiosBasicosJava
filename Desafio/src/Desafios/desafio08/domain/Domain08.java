package Desafios.desafio08.domain;
//8 - Faça um algoritmo que leia três valores inteiros diferentes
// e imprima na tela os valores em ordem decrescente.
public class Domain08 {
    protected int a;
    protected int b;
    protected int c;

    public void ordemDec(){
        if(a > b && a > c){
            if(b>c){
                System.out.println("Ordem: "+a+"-"+b+"-"+c);
            } else{
                System.out.println("Ordem: "+a+"-"+c+"-"+b);
            }
        } else if (b > a && b > c){
            if(a>c){
                System.out.println("Ordem: "+b+"-"+a+"-"+c);
            } else{
                System.out.println("Ordem: "+b+"-"+c+"-"+a);
            }
        } else if (c>a && c > b){
            if(a>b){
                System.out.println("Ordem: "+c+"-"+a+"-"+b);
            } else{
                System.out.println("Ordem: "+c+"-"+b+"-"+a);
            }
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
