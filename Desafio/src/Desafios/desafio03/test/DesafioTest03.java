package Desafios.desafio03.test;

import Desafios.desafio03.domain.DesafioDomain03;
import Desafios.desafio03.service.DesafioService03;

public class DesafioTest03 {
    public static void main(String[] args){
        DesafioDomain03 desafioDomain03 = new DesafioDomain03();
        DesafioService03.calcularResultado(desafioDomain03);
    }
}
