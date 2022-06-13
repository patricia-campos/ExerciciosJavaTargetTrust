package ExemplosAula;

import java.util.Scanner;

public class ExercicioString01 {

    public static void main(String[] args) {

    /*
    System.out.println("Digite: ");
    double nota1 = pedirNota();

    public static String pedirNome() {
        String nome = new Scanner(System.in).nextString();
        return nome;
        }
     */

        String nomes[] = {"Camila", "Amanda", "Amanda", "José", "Sílvio", "Joana"};

        StringBuilder stringBuilderChamada = new StringBuilder();
        stringBuilderChamada.append("Nomes: \n");

        for (int i = 0; i < nomes.length; i++) {

            if (nomes.equals(nomes[i])) {
                System.out.println("Nome repetido");

            } else {
                stringBuilderChamada
                        .append("- ")
                        .append(nomes[i])
                        .append("\n");
            }

        }
        stringBuilderChamada.append("Fim do relatório.");
        //relatorio = relatorio + "Fim do relatório.";

        String relatorio = stringBuilderChamada.toString();
        System.out.println(relatorio);


    }
}
