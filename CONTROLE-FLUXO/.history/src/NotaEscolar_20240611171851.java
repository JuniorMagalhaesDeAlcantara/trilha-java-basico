public class NotaEscolar {
    public static void main(String[] args) {
        int media = 6;

        if (media >=7) {
           System.out.println("Aluno Aprovado!");
        } else if (media < 7 && >= 5 ) {
            System.out.println("Recuperção !");   
        } else {
            System.out.println("Aluno Reprovado!");
        }
    }
}
