import java.util.Scanner;
public class Lab61{
    public static void main(String[] args)
    {int x,y,z;
    Scanner p = new Scanner(System.in);
    System.out.println("Enter the 3 numbers :");
    x=p.nextInt();
    y=p.nextInt();
    z=p.nextInt();
    if(x>y && x>z) System.out.println("Largest Number is :"+x);
    if(y>x && y>z) System.out.println("Largest Number is :"+y);
    if(z>x && z>y) System.out.println("Largest Number is :"+z);
    
}
}