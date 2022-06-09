package ExemplosAula;

import java.util.Scanner;

public class MediaSimples {

    public static void main(String[] args) {

        System.out.println("Primeira nota: ");
        double nota1 = pedirNota(); //chama o método pedir nota

        System.out.println("Primeira nota: ");
        double nota2 = pedirNota(); //chama o método pedir nota

        double media = media(nota1, nota2);

        System.out.println("A média das notas é " + media);
    }

    public static double pedirNota() {
        double nota = new Scanner(System.in).nextDouble();
        return nota;
    }
    public static double media (double nota1, double nota2) {
        double media = (nota1+nota2)/2;
        return media;//é o que vai entregar o conteudo da variável dele
    }
}
