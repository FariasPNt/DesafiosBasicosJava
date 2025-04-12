package Desafios.desafio16;

public class Domain16 {
    protected int a;
    protected int b;
    protected int c;

    public boolean trianguloValido(int a, int b, int c){
        return ((a + b) > c && (a + c) > b && (b + c) > a);
    }

    public void classificacaoTriangulo(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("Triângulo Equilátero");
        } else if (a == b || b == c || a == c) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
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
