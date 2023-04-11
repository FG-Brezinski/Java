package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Corsa";
        carro1.modelo = "Hatch";
        carro1.ano = 2015;

        carro2.nome = "M3";
        carro2.modelo = "Sedan";
        carro2.ano = 2023;

        carro1 = carro2;

        System.out.println("Carro01");
        System.out.println("Ano:" + carro1.ano);
        System.out.println("Nome:" + carro1.nome);
        System.out.println("Modelo:" + carro1.modelo);

        System.out.println("\nCarro02");
        System.out.println("Ano:" + carro2.ano);
        System.out.println("Nome:" + carro2.nome);
        System.out.println("Modelo:" + carro2.modelo);


    }
}
