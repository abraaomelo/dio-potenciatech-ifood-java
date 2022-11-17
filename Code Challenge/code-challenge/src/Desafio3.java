// Descrição
// Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.   

// Entrada
// A Entrada será composta por um número inteiro, N. 

// Saída
// Será  impresso o somatório de N até 0, como no exemplo a baixo: 

// EXEMPLO DE ENTRADA

// EXEMPLO DE SAÍDA

// 10	55
// 4	10
// 15	120
 

 

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        int numero1;
        Scanner numero = new Scanner(System.in);
        
        numero1 = numero.nextInt();
        
        System.out.println(somatorio(numero1));
    }

    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
