package Introdução_Java;

public class Aula012 {
    //Como utilizar o break
    public static void main(String[] args) {

        int valorMaximo = 50;
        for (int i = 0; i < valorMaximo; i++){
            if(i > 25){
                break;
            }
            System.out.println(i);
        }

        //Deado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição valorParcela >= 1000

        int valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro ; parcela++) {
           double valorParcela = valorCarro / parcela;
           if(valorParcela < 1000){
               break;
           }
            System.out.println("Até "+parcela+" parcelas de R$ "+valorParcela);
        }
    }
}
