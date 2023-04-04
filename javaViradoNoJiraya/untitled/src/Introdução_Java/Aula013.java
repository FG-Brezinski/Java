package Introdução_Java;

public class Aula013 {
    public static void main(String[] args) {
        //USANDO CONTINUE
        //Deado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição valorParcela >= 1000

        double valorCarro = 30000;
        for (int parcela = (int) valorCarro; parcela >= 1 ; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Até "+parcela+" parcelas de R$ "+valorParcela);

        }
    }
}
