import java.util.Scanner;

class InvalidTimeException extends Exception
{
    public String toString()
    {
        return "Invalid Time";
    }
}
class Time
{
    int calculate(int hr,int min)
    {
        return hr*60+min;
    }
}
public class Lab123 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        Time t=new Time();
         String str;
        do
        {
            System.out.println("------------start_time-------------");
            System.out.println("enter start_hour:");
            int start_hr = s.nextInt();
            
            System.out.println("enter start_minute:");
            int start_min = s.nextInt();
            
            System.out.println("------------end_time-------------");
            System.out.println("enter end_hour:");
            int end_hr = s.nextInt();
            
            System.out.println("enter end_minute:");
            int end_min = s.nextInt();
        
        try 
        {
            if(t.calculate(start_hr, start_min)>t.calculate(end_hr,end_min))
                throw new InvalidTimeException();
            System.out.println("Time difference in minutes is: "+(t.calculate(end_hr, end_min)-t.calculate(start_hr,start_min)));
        } 
        catch (InvalidTimeException e) 
        {
            System.out.println(e);
        }
        
        finally
        {
           
                System.out.println("Do you want to retry?");
                str=s.next();
        }
        }while(str.equals("yes"));
    }
}