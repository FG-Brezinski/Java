public class Aula006 {
    public static void main(String[] args) {
        //Operador ternário
        //Doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 reais";
        String mensagemNãoDoar = "Ainda não tenho condições, mas vou ter!";
        //(Condicao) ? verdadeiro : falso;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNãoDoar;

        System.out.println(resultado);
    }
}
