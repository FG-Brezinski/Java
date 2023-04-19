package javacore.Bintroducaoclasses.test;

import javacore.Bintroducaoclasses.domonio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
       double result =  calculadora.divideDoisNumeros02(20,0);
        System.out.println(result);
        System.out.println("------------------------");
        calculadora.imprimeDivisãoDeDoisNumeros(86,0);

    }
}
