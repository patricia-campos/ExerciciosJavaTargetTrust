package ExemplosAula;

import java.util.Scanner;

public class ImprimeArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tamVetor = 5;
        int array[] = new int[tamVetor];

        for (int i = 0; i < tamVetor; i++) {
            System.out.println("Informe um número: ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 != 0) {

            }
            System.out.println(array[i]);
        }


    }

}