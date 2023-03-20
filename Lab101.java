import java.util.Scanner;
abstract class Student1
{
    int rollno, regno ;
    abstract void course();
}
class Kiitian extends Student1
{
    Kiitian(int a , int b)
    {
        rollno = a;
        regno = b;
    }
    void course()
    {
     System.out.println("Roll no : "+rollno);
     System.out.println("Regn no : "+regno);
    }
}
public class Lab101{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll and registration number : ");
        int a , b;
        a=sc.nextInt();
        b=sc.nextInt();
        Student1 s= new Kiitian(a,b);
        s.course();
    }
}