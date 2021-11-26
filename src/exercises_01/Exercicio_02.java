/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Algoritmos e Estruturas de Dados
 *  Programa: Lê um número inteiro e imprime a tabuada.
 */

package exercises_01;

import java.util.Scanner;

public class Exercicio_02 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Declaração das Variáveis
        int num, mult=0;

        //Entradas de Dados
        System.out.print("Informe um número inteiro: ");
        num = sc.nextInt();
        sc.close();

        //Calcula a tabuada 
        for(int i = 1; i <= 10; i++)
        {
            mult = num * i;
            System.out.println(num + " x " + i + " = " + mult);
        }
        System.out.println();
    }
}
