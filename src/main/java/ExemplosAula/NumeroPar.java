package ExemplosAula;

import java.util.Scanner;

public class NumeroPar {

    public static void main(String[] args) {

        int numero = pedirNumero();
        boolean par = isPar(numero);
        System.out.println(numero + " é par? " + par);
    }

    public static int pedirNumero() {
        System.out.println("Digite um número: ");
        int entradaNumero = new Scanner(System.in).nextInt();
        return entradaNumero;
    }

    public static boolean isPar (int numero) {
       // if (numero % 2 == 0) {
       //     return true;
       // } else {
       //     return false;
       // }

        // Também podemos substituir o if por um ternário
        // return (numero % 2 == 0) ? true : false;

        // Melhor forma:
         return numero %2 == 0;

        // Também pode:
        // boolean numeroEhPar = numero % 2 == 0;
        // return numeroEhPar;
    }
}

