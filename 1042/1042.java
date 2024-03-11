import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        
        double a = t.nextDouble();
        double b = t.nextDouble();
        double c = t.nextDouble();
        
        int triangulo;
        
        if ((a + b > c) && (b + c > a) && (a + c > b)){
            triangulo = 1;
        }else{
            triangulo = 0;
        }
        
     