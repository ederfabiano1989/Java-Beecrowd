/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.


Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
*/


import java.util.Scanner;


public class Main{
    public static void main(String [] args){
        Scanner t = new Scanner(System.in);
        
        double [][] matriz = new double [5][2];
        
        matriz [0][0] = 1;
        matriz [0][1] = 4.00;
        matriz [1][0] = 2;
        matriz [1][1] = 4.50;
        matriz [2][0] = 3;
        matriz [2][1] = 5.00;
        matriz [3][0] = 4;
        matriz [3][1] = 2.00;
        matriz [4][0] = 5;
        matriz [4][1] = 1.50;
        
        double cod = t.nextDouble();
        double qtd = t.nextDouble();
        
        
        if ( cod == matriz[0][0]){
            double valor = qtd *  matriz [0][1];
            System.out.printf("Total: R$ %.2f\n", valor);
        }else if ( cod == matriz[1][0]){
            double valor = qtd *  matriz [1][1];
            System.out.printf("Total: R$ %.2f\n", valor);
        }else if (cod == matriz[2][0]){
            double valor = qtd * matriz[2][1];
            System.out.printf("Total: R$ %.2f\n", valor);
        }else if (cod == matriz[3][0]){
            double valor = qtd * matriz[3][1];
            System.out.printf("Total: R$ %.2f\n", valor);
        }else if ( cod == matriz[4][0]){
            double valor = qtd * matriz[4][1];
            System.out.printf("Total: R$ %.2f\n", valor);
        }else{
            System.out.println("Digite a opção correta");
        }
        
    }
}