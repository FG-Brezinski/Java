public class Aula001 {
    public static void main(String[] args) {

        //tipos primitivos: int, double, float, char, short, long, boolean

        //Criação de variavel a primeira letra sempre minuscula Ex:
        int dataAniversario;

        //Para fixar um valor em uma variavel, pode se utilizar o sinal de "="
        int i = 10;

        //Para imprimir o valor da variavel utilizar o comando SOUT (System.out.println(i);
        //Sem aspas duplas pois ele entende para usar o valor que está em memoria
        //Ex:
        System.out.println(i);

        //Para adicionar texto junto ao println e apenas utilizar as aspas duplas com o texto entre elas e logo o sinal de + e a variavel
        //Ex:
        System.out.println("A sua nota é "+i+", Parabens!");


        int idadade = 10;
        long numeroGrande = (long) 155.999999999;
        double salarioDouble = 2000d;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Um graaaaaaaande texto";
        System.out.println(numeroGrande);

    }

}