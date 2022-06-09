package ExemplosAula;

import java.util.Scanner;

public class Anos {

    public static void main(String[] args) {

        System.out.println("Ano Início: ");
        int anoInicio = pedirAno(); //chama o método pedir ano

        System.out.println("Ano Final: ");
        int anoFim = pedirAno(); //chama o método pedir ano

        int diferencaAnos = diferenca (anoInicio, anoFim);

        System.out.println("Diferença entre " + anoInicio + " e " + anoFim
                + " é " + diferencaAnos);
    }

    public static int pedirAno() {
        int ano = new Scanner(System.in).nextInt();
        return ano;
    }

    public static int diferenca (int anoInicio, int anoFim) {
        int subtracao = anoInicio-anoFim;
        return subtracao;
        //melhorando o código:
        // return a-b;
    }
}
