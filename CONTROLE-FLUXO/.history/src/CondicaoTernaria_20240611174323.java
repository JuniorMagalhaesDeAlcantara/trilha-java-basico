public class CondicaoTernaria {
    public static void main(String[] args) {
        
    int media = 5;
    String resultado = media >= 7 ? "Aprovado" : media >= 5 ? "Recuperação" : "Reprovado";
    System.out.println("Aluno " + resultado);
    }
}
