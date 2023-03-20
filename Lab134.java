import java.util.*;
public class Lab134 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        String a ,b;
        System.out.println("Enter Two Strings  ");
        a= in.nextLine();
        b= in.nextLine();
        System.out.println("Before swap: " + a + " " + b);
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("After : " + a + " " + b);
    }
}