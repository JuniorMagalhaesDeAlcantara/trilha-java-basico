public class usuarioSmartTv{

    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada ?" +smartTv.ligada);
        System.out.println("Canal atual ?" +smartTv.canal);
        System.out.println("Valume atual ?" +smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv Ligada ?" +smartTv.ligada);

        smartTv.diminuirVolume();
        System.out.println("Volume atual: " +smartTv.volume); 
        
        smartTv.mudarCanal(21);
        System.out.println("Canal atual: " +smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Canal atual: " +smartTv.canal); 
    }
}