import .SmartTv;

public class usuarioSmartTv{

    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada ?" +smartTv.ligada);
        System.out.println("Canal atual ?" +smartTv.canal);
        System.out.println("Valume atual ?" +smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv Ligada ?" +smartTv.ligada);    
    }
}
