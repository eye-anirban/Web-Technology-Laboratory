import java.util.Scanner;
public class Lab74{
    static int p = 0 ;
    Lab74()
    {
        p = p + 1 ;
    }
    public static void main(String[] args)
    {
        Lab74 obj1=new Lab74() ;
        Lab74 obj2=new Lab74() ;
        Lab74 obj3=new Lab74() ;
        Lab74 obj4=new Lab74() ;
        Lab74 obj5=new Lab74() ;
        System.out.println("Total number of objects created is "+p) ;
    }
}