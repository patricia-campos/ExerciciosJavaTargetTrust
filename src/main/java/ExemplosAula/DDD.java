package ExemplosAula;

import java.util.Scanner;

public class DDD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu DDD: ");
        int ddd = sc.nextInt();


        switch (ddd) {
            case 51:
                System.out.println(ddd + " Região Metropolitana de Porto Alegre.");
                break;

            case 53:
                System.out.println(ddd + " Pelotas e Região.");
                break;

            case 54:
                System.out.println(ddd + " Caxias do Sul e Região.");
                break;

            case 55:
                System.out.println(ddd + " Santa Maria e Região.");
                break;

            default:
                System.out.println(ddd + " Região não identificada");

        }
    }
}
