/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Algoritmos e Estruturas de Dados
 *  Programa: Construa um programa com os métodos a seguir 
 */

package exercises_02; 

import java.util.Scanner;

public class Exercicio_01
{
    //Retorn o dobro de um valor
    public static int dobro(int num)
    {
        return num * num;
    }

    //Retorna o maior valor
    public static int maior(int num1, int num2)
    {
        int maior;
        maior = num1;
        
        if(num2 > maior)
        {
            return num2;
        }
        else
        {
            return num1;
        } 
    }

    //Retorna a diferença entre o maior e menor
    public static int diferenca(int num1, int num2)
    {
        int maior;
        maior = num1;
        
        if(num2 > maior)
        {
            return num2 - num1;
        }
        else
        {
            return num1 - num2;
        } 
    }

    //Retorna a soma dos elementos entre 1 e o valor recebido
    public static int soma(int num)
    {
        int soma = 1; 

        for(int i = 0; i <= num; i++)
        {
            soma = soma + i;
        }
        return soma + num;
    }

    //Retorne o fatorial de um número
    public static int fatorial(int num)
    {
        int fat = 1;

        for(int i = 1; i <= num; i++)
        {
            fat = fat * i;
        }
        return fat;
    }

    //Retorna true se o valor for par e false se for impar
    public static boolean parImpar(int num)
    {
        if(num % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Retorna true se o valor for primo e false caso contrário
    public static boolean primo(int num)
    {
        if(num % 2 == 0 && num % num == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Retorna a soma dos elementos um vetor de numero reais
    public static double somaVet(double[] vet)
    {
        double soma = 0;

        for(int i = 0; i < vet.length; i++)
        {
            soma = soma + vet[i];
        }
        return soma;
    }

    //Retorna a média dos elementos um vetor de numero reais
    public static double mediaVet(double[] vet)
    {
        double media = 0;
        media = somaVet(vet);

        return media / vet.length;
    }

    //Retorna o maior valor de um vetor de números inteiros
    public static int maiorVet(int[] vet)
    {
        int maior = vet[0];

        for(int i = 0; i < vet.length; i++)
        {
            if(vet[i] > maior)
            {
                maior = vet[i];
            }
        }
        return maior;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Declaração das Variáveis
        int num1, num2;
        int vet;

        //Entrada de Dados
        System.out.print("Informe um número inteiro: ");
        num1 = sc.nextInt();
        System.out.print("Informe um outro número inteiro: ");
        num2 = sc.nextInt();

        System.out.print("Informe o número de elementos do vetor: ");
        vet = sc.nextInt();

        //Declaração dos vetores
        int[] vetInt = new int[vet];
        double[] vetDouble = new double[vet];

        //Percorre um vetor de inteiros
        for(int i = 0; i < vetInt.length; i++)
        {
            System.out.print("Informe um elemento inteiro para o vetor [" + (i + 1) + "]: ");
            vetInt[i] = sc.nextInt();
        }

        //Percorre um vetor de reais
        for(int c = 0; c < vetDouble.length; c++)
        {
            System.out.print("Informe um elemento real para o vetor [" + (c + 1) + "]: ");
            vetDouble[c] = sc.nextInt();
        }
        sc.close();

        System.out.println("===============================================");

        //Saída de Dados e chamada dos métodos
        int dobroNum = dobro(num1);
        System.out.println("O dobro de " + num1 + " é: " + dobroNum);

        int maiorNum = maior(num1, num2);
        System.out.println("O maior número entre " + num1 + " e " + num2 + " é: " + maiorNum);

        int dif = diferenca(num1, num2);
        System.out.println("A diferença entre " + num1 + " e " + num2 + " é: " + dif);

        int somaNum = soma(num1);
        System.out.println("A soma dos elementos entre  1 e " + num1 +" é: " + somaNum);

        int fat = fatorial(num1);
        System.out.println("O fatorial de " + num1 + "! " + fat);

        boolean parImpar = parImpar(num1);
        System.out.println("O valor " + num1 + " é? " + parImpar);

        boolean primo = primo(num1);
        System.out.println("O valor " + num1 + " é primo? " + primo);

        double somaVet = somaVet(vetDouble);
        System.out.println("A soma dos elementos do vetor é: " + somaVet);

        double mediaVet = mediaVet(vetDouble);
        System.out.println("A média dos elementos do vetor é: " + mediaVet);

        int maiorVet = maiorVet(vetInt);
        System.out.println("O maior elemento do vetor é: " + maiorVet);
    }
}