package Desafios.desafio04.test;

import Desafios.desafio04.domain.DesafioDomain04;
import Desafios.desafio04.service.DesafioService04;

public class DesafioTest04 {
    public static void main(String[] args) {
        DesafioDomain04 desafioDomain04 = new DesafioDomain04();
        DesafioService04.calcularDesafio(desafioDomain04);
    }
}
