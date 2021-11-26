/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Algoritmos e Estruturas de Dados
 *  Programa: Lê um vetor e imprima o maior elemento e
 *   sua posição, a media dos elementos e os elementos
 *   acima e abaixo da media com suas respectivas posições.
 */

package exercises_01;

import java.util.Scanner;

public class Exercicio_03 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Declaração da Variável 
        int vetTam, pos=0;
        double media=0, maior;

        //Entrada de Dados
        System.out.print("Informe o tamanho do vetor: ");
        vetTam = sc.nextInt();

        //Declaração do vetor
        double[] vetNum = new double[vetTam];

        //Insere elementos no vetor
        for(int i = 0; i < vetNum.length; i++)
        {
            System.out.print("Informe o elemento [" + (i + 1) + "] do vetor: ");
            vetNum[i] = sc.nextDouble();
        }
        sc.close();

        maior = vetNum[0];
        //Percorre o vetor
        for(int i = 0; i < vetNum.length; i++)
        {
            //Verifica o maior elemento
            if(vetNum[i] > maior)
            {
                maior = vetNum[i];
                pos = i;
            }
            media = (media + vetNum[i]);
        }
        media = media / vetNum.length; //calcula a media

        //Saída de Dados
        System.out.println("\nO maior elemento do vetor é: " + maior + " e esta na posição[" + (pos + 1) + "]");
        System.out.println("A media dos elementos do vetor é: " + media);
        System.out.print("Os elementos acima da media são:");
        
        //Percorre o vetor
        for(int i = 0; i < vetNum.length; i++)
        {
            //Verifica os elementos acima da media
            if(vetNum[i] > media)
            {
                System.out.print(" " + vetNum[i] + " ");
                System.out.print("na posição[" + (i + 1) + "]");
            }
        }

        System.out.println();
        System.out.print("Os elementos abaixo da media são:");

        //Percorre o vetor
        for(int i = 0; i < vetNum.length; i++)
        {
            //Verifica os elementos abaixo da media
            if(vetNum[i] < media)
            {
                System.out.print(" " + vetNum[i] + " ");
                System.out.print("na posição[" + (i + 1) + "]");
            }
        }
        System.out.println("\n");
    }    
}
