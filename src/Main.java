import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("Enter num1: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        System.out.println("Enter num2: ");
        int n2 = sc.nextInt();

        int add = n1+n2;
        int sub = n1-n2;
        int mul = n1*n2;
        int div = n1/n2;
        System.out.println("Addition: "+ add);
        System.out.println("Subtraction : "+ sub);
        System.out.println("Multiplication: "+ mul);
        System.out.println("Division : "+ div);
    }
}