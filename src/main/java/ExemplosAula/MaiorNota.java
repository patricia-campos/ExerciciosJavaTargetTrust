package ExemplosAula;

import java.util.Scanner;

public class MaiorNota {

    public static void main(String[] args) {

        //int nota1 = pedirNota();
        //int nota2 = pedirNota();

        int nota1 = 3;
        int nota2 = 5;

        int maiorNota = obtemMaiorNota(nota1, nota2);
        System.out.printf("A maior nota encontrada é %d", maiorNota);
    }



   // public static int pedirNota() {
   //     System.out.println("Digite primeira nota: ");
   //     int nota1 = new Scanner(System.in).nextInt();
   //     return pedirNota();

   //     System.out.println("Digite segunda nota: ");
   //     int nota2 = new Scanner(System.in).nextInt();
   //     return pedirNota();//}

    public static int obtemMaiorNota (int nota1, int nota2) {
    //    if (nota1 > nota2) {
    //        return nota1;
    //    } else {
    //        return nota2;
    //    }
        int notaMaior = (nota1 > nota2) ? nota1 : nota2;
        return notaMaior;
    }
}

