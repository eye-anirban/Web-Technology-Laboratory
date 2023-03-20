import java.util.Scanner;
class Lab121
{
   public static void main(String args[])
   {  Scanner sc = new Scanner(System.in) ;
      String str;
      do{
      try{
         int num1, num2;
         System.out.println ("Enter 2 numbers : ");
         
         num1=sc.nextInt();
         num2=sc.nextInt();
         int output=num1/num2;
         System.out.println ("Result: "+output);
      }
      catch(ArithmeticException e){
         System.out.println ("You Shouldn't divide a number by zero");
      }
      finally
      {
           
                System.out.println("Do you want to retry?");
                str=sc.next();
      }
      }while(!str.equals("No"));  
   }
}