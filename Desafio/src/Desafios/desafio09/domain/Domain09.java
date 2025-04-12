package Desafios.desafio09.domain;
//9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa,
// leia o seu peso e sua altura e imprima na tela sua condição
//de acordo com a tabela abaixo:
//Fórmula do IMC = peso / (altura) ²
//Tabela Condições IMC
//Abaixo de 18,5   | Abaixo do peso
//Entre 18,6 e 24,9 | Peso ideal (parabéns)
//Entre 25,0 e 29,9 | Levemente acima do peso
//Entre 30,0 e 34,9 | Obesidade grau I
//Entre 35,0 e 39,9 | Obesidade grau II (severa)
//Maior ou igual a 40 | Obesidade grau III (mórbida)


public class Domain09 {
    protected double peso;
    protected double altura;

    public double getAltura() {
        return altura;
    }
    public double calcularIMC(){
        double result = peso / (altura * altura);
        return result;
    }
    public void resultadoIMC(double imc){
        if( imc <= 18.5){
            System.out.println("IMC: "+imc+" - Abaixo do peso");
        } else if(imc >=18.6 || imc < 25){
            System.out.println("IMC: "+imc+" - Peso ideal (parabéns)");
        } else if(imc >= 25 || imc < 30){
            System.out.println("IMC: "+imc+" - Levemente acima do peso");
        } else if(imc >= 30 || imc < 35){
            System.out.println("IMC: "+imc+" - Obesidade grau I");
        } else if(imc >= 35 || imc < 40){
            System.out.println("IMC: "+imc+" - Obesidade grau II (severa)");
        } else{
            System.out.println("IMC: "+imc+" - Obesidade grau III (mórbida)");
        }
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
