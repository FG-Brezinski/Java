package Introdução_Java;

public class Aula004 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        //!
        /*
        if(isAutorizadoComprarBebida){
            System.out.println("Pode");
        }

        if (!isAutorizadoComprarBebida){
            System.out.println("Não Pode");
        }

         */
        if(isAutorizadoComprarBebida){
            System.out.println("Pode");
        }else{
            System.out.println("Não Pode");
        }
        if (!isAutorizadoComprarBebida){
            System.out.println("Não Pode");
        }


    }
}
