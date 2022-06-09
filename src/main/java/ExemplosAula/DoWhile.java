package ExemplosAula;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero;
        boolean valido;

        do {
            System.out.println("Informe um número: ");
            numero = sc.nextDouble();

            //puxando o método para testar:
            valido = verificaRange(numero);

        } while (numero < 0 || numero > 100);

    }

    //MÉTODO PARA VERIFICAR A RANGE
    public static boolean verificaRange(double numero) {

        if (numero > 0 && numero < 100) {
            System.out.println("O número está no intervalo de 0 a 100");
            return true;
        } else {
            System.out.println("O número NÃO está no intervalo de 0 a 100");
            return false;
        }

    }
}