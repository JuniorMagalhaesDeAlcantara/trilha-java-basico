public class tiposEVariaveis {

    public static void main(String[] args) {
            byte idade = 123;
            short ano = 2021;
            int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
            long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
            float pi = 3.14F;
            double salario = 1275.33;

            System.out.println(ano);
        }
}

/*
 byte idade = 123;: Declara a variável idade do tipo byte e atribui o valor 123. O tipo byte armazena valores inteiros de -128 a 127.
short ano = 2021;: Declara a variável ano do tipo short e atribui o valor 2021. O tipo short armazena valores inteiros de -32.768 a 32.767.
int cep = 21070333;: Declara a variável cep do tipo int e atribui o valor 21070333. O tipo int armazena valores inteiros de -2.147.483.648 a 2.147.483.647.
long cpf = 98765432109L;: Declara a variável cpf do tipo long e atribui o valor 98765432109L. O tipo long armazena valores inteiros de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807. Utilize o sufixo L para indicar valores long.
float pi = 3.14F;: Declara a variável pi do tipo float e atribui o valor 3.14F. O tipo float armazena números de ponto flutuante com precisão simples (aproximadamente 7 dígitos decimais). Utilize o sufixo F para indicar valores float.
double salario = 1275.33;: Declara a variável salario do tipo double e atribui o valor 1275.33. O tipo double armazena números de ponto flutuante com precisão dupla (aproximadamente 15 dígitos decimais).
 */