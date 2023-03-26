public class Aula005 {
    public static void main(String[] args) {
        // idade < 15 conategoria infantil
        // idade >=15 && idade < 18  conategoria juvenil
        // idade >= 18 categoria adulto
        int idade = 18;

        if (idade < 15){
            System.out.println("Categoria infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria juvenil");
        } else {
            System.out.println("Categoria adulto");
        }

    }
    }
