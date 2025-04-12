package Desafios.desafio05.domain;
//5 - Faça um algoritmo que leia o valor do salário mínimo
// e o valor do salário de um usuário, calcule quantos salários mínimos esse
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
public class DesafioDomain05 {
    public static final double SALARIO_MINIMO = 1293.20;
    protected double salario;
    protected double qtdSalarioMinimo;

    public double calcValorSalario(){
        double result = this.salario / SALARIO_MINIMO;
        return result;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getQtdSalarioMinimo() {
        return qtdSalarioMinimo;
    }

    public void setQtdSalarioMinimo(double qtdSalarioMinimo) {
        this.qtdSalarioMinimo = qtdSalarioMinimo;
    }
}
