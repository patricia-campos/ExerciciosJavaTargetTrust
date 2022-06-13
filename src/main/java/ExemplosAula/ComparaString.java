package ExemplosAula;

public class ComparaString {
    public static void main(String[] args) {

        //String statusPedido = "concluido"; // essa vai pro String Pool
        String statusPedido = new String("concluido"); // Essa vai para a HEAP (nÃ£o Ã© reaproveitada)
        //String statusPedido = new Scanner(System.in).nextLine(); // Essa vai para a HEAP (nÃ£o Ã© reaproveitada)

        // PROVAVELMENTE ERRADO, pois compara endereÃ§o de memÃ³ria
        if(statusPedido == "concluido"){
            System.out.println("Está concluído!");
        }else {
            System.out.println("Pedido em andamento!");
        }

        // NÃ£o se aplicam a String na parte dos casos ==, !=, >=, >, <

        if(statusPedido.equals("concluido")){ // CERTO
            System.out.println("Está concluído!");
        }

        if(statusPedido.equalsIgnoreCase("CONCLUIDO")){ // CERTO
            System.out.println("Está concluído!");
        }

        if(statusPedido.compareTo("concluido") == 0){ // CERTO
            System.out.println("Está concluído!");
        }

        if(statusPedido.compareToIgnoreCase("concluido") == 0){ // CERTO
            System.out.println("Está concluído!");
        }
    }
}

