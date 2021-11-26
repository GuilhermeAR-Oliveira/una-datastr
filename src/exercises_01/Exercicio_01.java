/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Algoritmos e Estruturas de Dados
 *  Programa: Lê 2 números e imprime todos os números 
 *   inteiros existentes entre esses dois números.
 */

package exercises_01; 

import java.util.Scanner;

public class Exercicio_01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Declaração das variáveis
        int num1, num2;

        //Entrada de Dados
        System.out.print("Digite um número inteiro: ");
        num1 = sc.nextInt();
        System.out.print("Digite um outro número inteiro: ");
        num2 = sc.nextInt();
        sc.close();

        //Verifica qual é menor valor 
        if(num1 < num2)
        {
            for(int i = num1; i < num2; i++)
            {
                System.out.print(i + " ");
            }
        }
        else
        {
            for(int i = num2; i < num1; i++)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }
}

