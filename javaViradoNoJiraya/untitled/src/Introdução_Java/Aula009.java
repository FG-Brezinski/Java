package Introdução_Java;

public class Aula009 {
    public static void main(String[] args) {
        //Utilizando Switch e dados as de 1 a 7, imprima se é dia ultil ou final de semana
        //Considerando 1 como domingo

        int dia = 1;

        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
