package Desafios.desafio05.test;

import Desafios.desafio05.domain.DesafioDomain05;
import Desafios.desafio05.service.DesafioService05;

public class Test05 {
    public static void main(String[] args) {
        DesafioDomain05 domain05 = new DesafioDomain05();
        DesafioService05.calcularSalarioMinimo(domain05);
    }
}
