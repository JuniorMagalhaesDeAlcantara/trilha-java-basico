public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.00;
        double saque = 24.00;

        if (saldo >= saque) {
            saldo = saldo - saque;
        System.out.println("Saldo Atual : " + saldo);
        }
    }
}
