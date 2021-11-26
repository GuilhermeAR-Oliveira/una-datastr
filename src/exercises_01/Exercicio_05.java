/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Algoritmos e Estruturas de Dados
 *  Programa: Solicita do usuarios 6 valores sorteados
 *   na Mega Sena e mais 6 valores jogados. No final
 *   imprime a quantidade de pontos feito pelo usuário.
 */

package exercises_01;

import java.util.Scanner;

public class Exercicio_05 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Declaração do vetor
        int[] vetS = new int[6];
        int[] vetJ = new int[6];
        int pont=0;

        //Percorre o vetor
        for(int i = 0; i < vetS.length; i++)
        {
            //Insere os valores no vetor
            System.out.print("Informe os números sorteados: ");
            vetS[i] = sc.nextInt();
        }

        System.out.println("=================================");

        //Percorre o vetor
        for(int i = 0; i < vetJ.length; i++)
        {
            //Insere os valores no vetor
            System.out.print("Informe os números jogados: ");
            vetJ[i] = sc.nextInt();
        }
        sc.close();

        //Percorre ambos os vetores
        for(int i = 0; i < vetS.length; i++) 
        {
            for(int j = 0; j < vetJ.length; j++)
            {
                //Verifica os elementos de cada vetor
                if(vetS[i] == vetJ[j])
                {
                    pont++;
                }
            }
        }

        System.out.print("\nVocê fez " + pont + " pontos no sorteio da Mega Sena");
        System.out.println();
    }    
}
