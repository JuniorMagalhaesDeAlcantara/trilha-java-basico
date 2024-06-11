public class NotaEscolar {
    public static void main(String[] args) {
        int media = 5;

        if (media >=7) {
           System.out.println("Aluno Aprovado!");
        } else if (media <7 && media >= 5 ) {
            System.out.println("Recuperação !");  
        } else {
            System.out.println("Aluno Reprovado!");
        }
    }
}
