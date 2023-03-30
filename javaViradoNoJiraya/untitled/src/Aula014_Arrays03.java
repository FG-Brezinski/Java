public class Aula014_Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        // Como inicializar o array com os tamanhos e valores ja informados
        int[] numeros2 = {1,2,3,4,5};
        
        int[] numeros3 = new int[]{1,2,3,4,5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
        //Outra forma de imprimir os Array

        for(int num:numeros3){
            System.out.println(num);
        }
    }
}

