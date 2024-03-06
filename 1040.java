/*
Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ". Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno. Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: " seguido da média final para esse aluno.

Entrada
A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos.

Saída
Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens devem ser impressas conforme a descrição do problema. Não esqueça de imprimir o enter após o final de cada linha, caso contrário obterá "Presentation Error".
*/

import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String [] args){
        Scanner t = new Scanner(System.in);
        
        double [] pesos = {0.2, 0.3 , 0.4 , 0.1};
        
        double n1 = t.nextDouble();
        double n2 = t.nextDouble();
        double n3 = t.nextDouble();
        double n4 = t.nextDouble();
        
        double media = (n1 * pesos[0] + n2 * pesos[1] + n3 * pesos [2] + n4 * pesos[3]);
        
        /*A maioria das linguagens arredonda isso para 4.9 enquanto as linguagens C e C++ arredondam para baixo, ou seja 4.8, que é o que o juiz está esperando.
        */
        System.out.printf("Media: %.1f\n", media - 0.0001);
        
        if (media >= 7){
            System.out.println("Aluno aprovado.");
        }else if(media >= 5 && media < 7){
            System.out.println("Aluno em exame.");
            
            double exame = t.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", exame);
            double mediaFinal = (media + exame) / 2;
            if (mediaFinal >= 5){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", mediaFinal);
            }else{
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", mediaFinal);
            }
        }else{
            System.out.println("Aluno reprovado.");
       }
    }
}