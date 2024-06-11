public class CondicaoTernaria {
    public static void main(String[] args) {
        int media = 6;
        String resultado =  media >= 7 ? "Aprovado" : media >= 5 && media < 7 ? "Recuperação" : media < 5 ? "Reprovado";

        System.out.println("Aluno " + resultado);
    }
}
