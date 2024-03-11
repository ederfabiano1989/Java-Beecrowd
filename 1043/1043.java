/* 
 Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:


Perimetro = XX.X


Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem


Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.
*/



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		double a = t.nextDouble();
		double b = t.nextDouble();
		double c = t.nextDouble();
		
		boolean triangulo = (a+b>c)&&(a+c>b)&&(b+c>a);
		
		if (triangulo){
			double perimetro = a + b + c;
			System.out.printf("Perimetro = %.1f\n",perimetro);
		}else {
			double area = ((a+b)*c)/2;
			System.out.printf("Area = %.1f\n",area);
		}
				
	}

}
