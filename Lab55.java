public class Lab55{
    public static void main(String[] args)
    {
        int num=10101;
        int rev=0, rem;
        int num1=num;
        while(num !=0)
        {
            rem=num%10;
            rev= rev * 10 + rem;
            num = num / 10;
        }
        if(num1 == rev)
        System.out.println(num1+" is Palindrome");
        else
        System.out.println(num1+" is not Palindrome");
    }
}