/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Algoritmos e Estruturas de Dados
 *  Programa: Lê um vetor com 5 posições, solicita
 *    do usuário um novo valor e faz busca por ele no vetor.
 *    Caso seja encontrado, o mesmo é retornado com a sua posição.  
 */

package exercises_01;

import java.util.Scanner;

public class Exercicio_04 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Declaração do Vetor
        int[] vet = {9, 4, 18, 32, 47};
        int num;

        //Entrada de Dados
        System.out.print("Informe um novo número para o vetor: ");
        num = sc.nextInt();
        sc.close();

        //Percorre o vetor
        for(int i = 0; i < vet.length; i++) 
        {
            //Verifica se o elemento se encontra no vetor
            if(vet[i] == num)
            {
                //Saída de Dados
                System.out.print("\nO elemento " + num + " se encontra na posição[" + (i  + 1) + "] do vetor.");
                break;
            }
            else
            {
                System.out.print("\nEsse elemento não exite no vetor.");
            }
        }
    }
}
