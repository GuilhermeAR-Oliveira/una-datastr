/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Algoritmos e Estruturas de Dados
 *  Programa: Construa um programa com os métodos para
 *   multiplicar, dividir e tirar a potencia. 
 *   Crie também um menu para as opções. O usuário 
 *   insere os dados.
 */

package exercises_02;

import java.util.Scanner;

public class Exercicio_02 
{
    //Retorna a multiplicao
    public static int multiplicacao(int a, int b)
    {
        return a * b;
    }

    //Retorna a potência
    public static double potencia(int a, int b)
    {
        return Math.pow(a, b);
    }

    //Retorna a divisão
    public static int divisao(int a, int b)
    {
        return a % b;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Declaração das Variáveis
        int num1, num2, opcao, multi, div;
        double potenc;

        
        System.out.println("=====================");
        System.out.println("    MENU DE OPÇÕES   ");
        System.out.println("=====================");
        System.out.println("[1] - Multiplicação");
        System.out.println("[2] - Potência");
        System.out.println("[3] - Divisão");
        System.out.println("[4] - Sair");
        System.out.println("=====================");

        System.out.print("Digite um opção: ");
        opcao = sc.nextInt();
        System.out.println("---------------------");

        //Seleciona a opção
        switch (opcao)
        {
            case 1: 
                //Entrada de Dados
                System.out.print("Informe um número inteiro: ");
                num1 = sc.nextInt();
                System.out.print("Informe um outro número inteiro: ");
                num2 = sc.nextInt();

                //Chamada do metodo
                multi = multiplicacao(num1, num2);

                //Saída de Dados
                System.out.println("O valor da multiplicação é: " + multi);
            break;

            case 2: 
                //Entrada de Dados
                System.out.print("Informe um número inteiro: ");
                num1 = sc.nextInt();
                System.out.print("Informe um outro número inteiro: ");
                num2 = sc.nextInt();

                //Chamada do metodo
                potenc = potencia(num1, num2);

                //Saída de Dados
                System.out.println("O valor da potência é: " + potenc);
            break;

            case 3: 
                //Entrada de Dados
                System.out.print("Informe um número inteiro: ");
                num1 = sc.nextInt();
                System.out.print("Informe um outro número inteiro: ");
                num2 = sc.nextInt();

                //Chamada do metodo
                div = divisao(num1, num2);

                //Saída de Dados
                System.out.println("O valor da divisão é: " + div);
            break;

            case 4: 
                System.exit(0);
            break;
        }
        sc.close();
    }
}
