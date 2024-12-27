package secao1.secao2;

public class Variavel {
    public static void main(String[] args) {

        // 1 - O que são variáveis
        // tipo -> nome -> atribuir um valor;

        String nome = "Cleuber";

        // nome => "Cleuber"
        System.out.println(nome);

        // 2 - Atribuição de variável com outra
        String teste = "Teste";

        String testando = teste;

        System.out.println(testando);

        long numeroGrande = 999999999999999L;

        System.out.println(numeroGrande);

        String firstName = "Cleuber";
        String lastName = "Santos";

        System.out.println("Cleuber Santos");

        System.out.println(firstName + " " + lastName);

        System.out.println("O nome dele é: " + firstName);

        String fulName = firstName + " " + lastName;

        // concatenação = operador + nas strings, para uni-las
        System.out.println(fulName);

        // 5 - Char

        char letra = 'A';

        System.out.println(letra);

        // 6 - int

        int n = 42;

        System.out.println(n);

        // 7 - Long

        long populacaoMundial = 78000000000L;

        System.out.println(populacaoMundial);

        long grandeNumero = 1_000_000L;

        System.out.println(grandeNumero + 1);

        // 8 - Double
        double preco = 19.99;

        System.out.println(preco);

        System.out.println(preco - 12);

        System.out.println(preco / 12);

        double pi = 3.14_592_123;

        System.out.println(pi);

        // 9 - OP. aritmeticos p1

        int soma2 = 12 + 5;

        System.out.println(soma2);

        System.out.println(22 + 4);

        System.out.println(10 - 5);

        System.out.println(10 * 5);

        System.out.println(10 / 2.5);

        System.out.println(10.0 / 2.5);

        /*para ter u resultado quebrado (1.5), pelo menos 1 
         * número da divisão tem que ser double
         */

         System.out.println(10 / 3);

         System.out.println(10.0 / 3);

         // 10 - Op. aritmeticos p2

         int x = 5;

         x++;
         x++;
         x++;
         x++;

         System.out.println(x);

         int y = 5;

         y--;

         System.out.println(y);

         int a = 10;

         a += 5;

         System.out.println(a);

         int b = 10;

         b -= 5;

         System.out.println(b);

         // 11 - type casting

         // implicito (widening)

         int numero2 = 42;

         long numeroLong = numero2;

         double numeroDouble = numero2;

         System.out.println(numeroLong);

         System.out.println(numeroDouble);

         // explicito (narrowing)

         double valorDouble = 9.78;
         
         int valorInt = (int) valorDouble;

         System.out.println(valorInt);

         // casting de char para int
         char letra3 = 'A';

         int condigoAscii = (int) letra3;

         System.out.println(condigoAscii);
         





    }
}
