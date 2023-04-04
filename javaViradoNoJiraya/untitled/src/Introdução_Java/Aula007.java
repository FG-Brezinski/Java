package Introdução_Java;

public class Aula007 {
    //EUR 0     EUR 34,712      9.70%
    //EUR 34,713     EUR 68,507      37.35%
    //EUR 68,508     49.50%
    public static void main(String[] args) {
        double salarioAnual = 45000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorDoImposto;

        if (salarioAnual <= 34712){
            valorDoImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34712 && salarioAnual <= 68507) {
            valorDoImposto = salarioAnual * primeiraFaixa;
        } else {
            valorDoImposto = salarioAnual * primeiraFaixa;
        }

        System.out.println(valorDoImposto);

    }
}
