public class  DeclarandoMetodo{
    public static void main(String[] args) {
        String primeiroNome ="Junior";
        String segundoNome = "Alcantara";

        System.out.println(nomeCompleto(primeiroNome, segundoNome));
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat("").concat(segundoNome);
    }

}