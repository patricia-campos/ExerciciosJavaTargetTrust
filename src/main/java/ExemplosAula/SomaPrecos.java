package ExemplosAula;

public class SomaPrecos {
    public static void main(String[] args) {

        // FORMAS DE CRIAR VETOR:

        // double [] precos = new double[] {7.90, 8.50, 7.90}; //declaraçao + instanciação
        // double [] precos; //declaraçao
        // precos = new double[2]; //instanciação

        double [] precos =  new double [2];
        precos[0] = 8.00;
        precos[1] = 8.50;
        precos[0] = 1.90;

        System.out.println("Valor: " + precos[0] + ", " + precos[1]);
        System.out.println("Quantidade de valores: " + precos.length);
    }
}
