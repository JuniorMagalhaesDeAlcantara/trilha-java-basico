public class  DeclarandoMetodo{
    public static void main(String[] args) {
        String primeiroNome ="Junior";
        String segundoNome = "Alcantara";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }

}

/*

Declarando Metodo

public: Define que o método nomeCompleto é acessível em qualquer lugar do seu projeto.
static: Indica que o método nomeCompleto pertence à classe em si, não a um objeto específico da classe.
String: Especifica o tipo de retorno do método, neste caso, uma string.
nomeCompleto: Nome do método que concatena os valores dos parâmetros primeiroNome e segundoNome e retorna o resultado como string.
String primeiroNome: Parâmetro do método que recebe o primeiro nome.
String segundoNome: Parâmetro do método que recebe o segundo nome.
return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);: Retorna a string formada pela concatenação de "Resultado do metodo ", o valor de primeiroNome, um espaço, o valor de segundoNome e outro espaço.
 */