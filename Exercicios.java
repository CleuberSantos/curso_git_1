  /*
        Exercício 1:

        Crie uma variavel int para armazenar o valor 10.
        Crie uma segunda variável int que armazene o dobro do valor da primeira variável
        usando operadores aritméticos.
        Exiba o resultado.
        
        Exercício 2:

        Declare uma variável char que armazena a letra 'B'.
        Faça o casting explícito dessa variável para int e exiba o valor numério correspondente.

        Exercício 3:

        Declare duas variáveis double para armazenar os valores 15.75 e 20.40.
        Some os valores dessas variáveis e armazene o resultado em uma nova variável double.
        Exiba o resltado.

        Exercício 4;

        Declare uma variável long para armazenar o número 2 bilhões (2_000_000_000).
        Em seguida, ,declare uma variável int e faça o casting explícito do valor long para int.
        Exiba o resultado.

        Exercício 5:

        Escreva um programa que crie uma variável String com o valor "Olá Mundo!".
        Em seguida, crie outra variável String que concatene a primeira variável com o texto
        "Bem-Vindo ao Java!".

     */

package secao1.secao2;

public class Exercicios {
    
public static void main(String[] args) {
    
    // Ex 1
    int valorOriginal = 10;
    int valorDobrado = valorOriginal * 2;

    System.out.println(valorDobrado);

    // Ex 2
    char letra = 'B';
    int valorAscii = (int) letra;

    System.out.println(valorAscii);

    // Ex 3
    double n1 = 15.75;
    double n2 = 20.40;

    double soma = n1 + n2;
    
    System.out.println("A soma é igual: " + soma);

    // Ex 4
    long numeroGrande = 2_000_000_000L;

    int numeroInt = (int) numeroGrande;

    System.out.println(numeroInt);


    // Ex 5
    String saudacao = "Olá, Mundo!";
    String mensagem = saudacao + "Bem-Vindo ao Java!";

    System.out.println(mensagem);

}
  
}

