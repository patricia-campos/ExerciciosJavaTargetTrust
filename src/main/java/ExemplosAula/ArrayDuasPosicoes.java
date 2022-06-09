package ExemplosAula;

public class ArrayDuasPosicoes {

    public static void main(String[] args) {

        int[] numeros = new int[]{4, 5, 9, 0};
        int[] resultado = ObtemElementos(numeros);
        System.out.println(resultado[0] + " , " + resultado[1]);
    }

    public static int[] ObtemElementos(int [] numeros) {
        int[] numerosNovo = {numeros[0], numeros[3]};
        return numerosNovo;
    }
}

