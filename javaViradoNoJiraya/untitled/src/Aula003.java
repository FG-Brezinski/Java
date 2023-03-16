public class Aula003 {

    public static void main(String[] args) {

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
        System.out.println("isDezDiferenteQueVinte "+isDezDiferentelVinte);

    }
}
