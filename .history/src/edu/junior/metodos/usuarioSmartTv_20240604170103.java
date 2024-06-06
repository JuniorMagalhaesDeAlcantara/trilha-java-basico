public class usuarioSmartTv{

    public static void main(String[] args) throws Exception {
        
        Exercicio exercicio = new exercicio();

        System.out.println("Tv Ligada ?" + exercicio.ligada);
        System.out.println("Canal atual ?" + exercicio.canal);
        System.out.println("Valume atual ?" + exercicio.volume);

    }
}