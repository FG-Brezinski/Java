package Introdução_Java;

public class Aula008 {
    public static void main(String[] args) {
        //Estrutura condicional Switch - Case
        // Imprima o dia da semana considerando 1 como domingo
        byte dia = 7;
        // char, int, byte, short, enum, String

        switch (dia){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção Invalida");

        }

        char sexo = 'f';
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            case 'm':
                System.out.println("Homem");
                break;
            case 'f':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }

    }
}
