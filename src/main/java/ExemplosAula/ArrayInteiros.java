package ExemplosAula;

public class ArrayInteiros {

    public static void main(String[] args) {

        int[] numeros = new int[]{4, 5, 9, 0};
        int resultado = LerPrimeiroElemento(numeros);

        System.out.println("Primeiro elemento é: " + resultado);
    }

    public static int LerPrimeiroElemento(int numeros[]) {
        int primeiroElemento = numeros[0];

        if (primeiroElemento == 0) {
            return -1;
        } else {
            return primeiroElemento;
        }
    }
}
