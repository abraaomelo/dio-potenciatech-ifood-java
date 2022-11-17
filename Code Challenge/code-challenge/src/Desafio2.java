// Desafio
// Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.

// Entrada
// A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda. 

// Saída
// A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.

// Exemplo 1

// Entrada	Saída
// 5
// 20	50
// Exemplo 2

// Entrada	Saída
// 3
// 18	63


import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        int A, N, soma=0;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        System.out.println("\n");
        
        for(int i=0 ; i<N+1 ; i++){
            if(i%A == 0){
              //  System.out.println(i);
              soma=soma+i;
            }
        }
        System.out.println(soma);
    }
}
