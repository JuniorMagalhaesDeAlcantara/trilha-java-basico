import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.00;
        while (mesada > 0){
            double valorDoce = valorAleatorio();
             
            System.out.println("Doce adicionado ao carrinho" + "Valor do Doce: " + valorDoce);
            mesada = mesada - valorDoce;
            System.out.println("Valor atual da mesada : " + mesada);
            

        }
            System.out.println("João gastou toda mesada");
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
