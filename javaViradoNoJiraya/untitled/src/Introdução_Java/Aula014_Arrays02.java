package Introdução_Java;

public class Aula014_Arrays02 {
    public static void main(String[] args) {
        /*
        Valor de iniciação de array
        byte, short, int, long, float e double = 0
        char =  '\u0000' ' '
        Boolean = false
        String = null
        */
        String[] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "João";
        nomes[2] = "Pedro";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
