package ExemplosAula;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int numero = 0;

        System.out.println("Informe um número: ");
        numero = sc.nextInt();

        percorreEImprimeNumero(numero);

        }

        public static void percorreEImprimeNumero(int numero) {
            while (numero != 0) {
                System.out.println(numero);
                numero --;
            }
        }

    }

