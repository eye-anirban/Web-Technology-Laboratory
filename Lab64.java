import java.util.Scanner;
class Box{
    int h,b,l;
    int volume()
    {
        return h * b * l;
    }
}
public class Lab64
{
    public static void main(String[] args)
    {
        Box mybox=new Box();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height , breadth and length respectively : ");
        mybox.h=sc.nextInt();
        mybox.b=sc.nextInt();
        mybox.l=sc.nextInt();
        System.out.println("Volume of the box is : "+mybox.volume());
        
    }
}