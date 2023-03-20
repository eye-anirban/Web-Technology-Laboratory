import java.util.Scanner;
class SavingsAccount{
	static float roi;
	int acc_no;
	String name;
	float balance;
	static void modifyIntrate(float t)
	{
		roi = t;
	}
	float calculateInterest(int t, int p)
	{
		return (p*t*roi)/100;
	}
}
public class Lab75{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the initial rate of interest: ");
		float rt = sc.nextFloat();
		SavingsAccount acc1 = new SavingsAccount();
		SavingsAccount acc2 = new SavingsAccount();
		SavingsAccount.modifyIntrate(rt);
		System.out.print("Enter time and principal ammount: ");
		int p = sc.nextInt(), t = sc.nextInt();
		float res = acc1.calculateInterest(p, t);
		System.out.println("interest is " + res);
		System.out.print("Enter the modified rate of interest: ");
		rt = sc.nextFloat();
		SavingsAccount.modifyIntrate(rt);
		System.out.print("Enter time and principal ammount: ");
		p = sc.nextInt(); t = sc.nextInt();
		res = acc2.calculateInterest(p, t);
		System.out.println("interest is " + res);
    }
}