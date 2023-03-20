import java.util.Scanner;
class Multiply
{
    void multiplication(int a,int b)
    {
        System.out.println("Product is :"+(a*b));
    }
    void multiplication(int a,int b,int c)
    {
        System.out.println("Product is :"+(a*b*c));
    }
    void multiplication(double a,int b)
    {
        System.out.println("Product is :"+(a*b));
    }
}
public class Lab65
{
    public static void main(String[] args)
    { 
        Multiply m=new Multiply();;
        Scanner sc=new Scanner(System.in);
        int a ,b;
        System.out.println("Enter 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        m.multiplication(a,b);
        m.multiplication(a,b,6);
        m.multiplication(5.2,b);
    }
}