package Introdução_Java;

public class Aula010 {
    public static void main(String[] args) {
        //Estruturas de repetição
        // while, do while, for
         int cont = 0;
        while (cont <= 10){
            System.out.println(cont);
            cont++;
        }

        do {
            System.out.println(cont);
        }while (cont <= 10);

        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }
}
