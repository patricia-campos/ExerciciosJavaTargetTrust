package ExemplosAula;

public class LimitePeso {

    public static void main(String[] args) {

        Float limite = 22.5F;
        Float peso = 22.5F;

        if(peso.compareTo(limite) < 0) {
            System.out.println("Peso abaixo do limite");
        } else if (peso.equals(limite)) {
            System.out.println("Peso máximo atingido");
        } else {
            System.out.println("Excesso de peso");
        }

    }
}
