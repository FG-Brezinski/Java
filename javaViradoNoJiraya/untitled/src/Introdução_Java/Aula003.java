package Introdução_Java;

public class Aula003 {

    public static void main(String[] args) {
        /*
        //Operadores aritimeticos: = - * /
        int numero1 = 10;
        int numero02 = 20;

        int resultado = numero02 + numero1;

        System.out.println(resultado);

        //Operadores logicos:
        // %
        int resto = 20 % 2;
        System.out.println(resto);

        //Sempre vão retornar um valor booleano
        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferentelVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte "+isDezIgualVinte);
        System.out.println("isDezDiferenteQueVinte "+isDezDiferentelVinte );

        //  && (AND) (E)
        // || (OR) (OU)
        // Negaçao !

        int idade = 29;
        float salario = 3500F;
        boolean  isDentroDaLeiMaiorQueTrinta = idade  >= 30 && salario >= 4612;
        boolean  isDentroDaLeiMenorQueTrinta = idade  < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);



        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation =5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;
        System.out.println(isPlaystationCincoCompravel);

        // Operadores de atribuição: = += -= *= /= %=
        */
        double bonus = 1800; //1800
        bonus += 1000;//2800
        bonus -= 1000;//1800
        bonus *= 2;//1800
        bonus /= 2;//1800
        bonus %= 2;//1800
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1;
        contador -= 1;
        contador++;
        contador--;
        System.out.println(contador);
    }
}
