import java.util.Scanner;
interface Salary
{
	double earnings();
	double deductions();
	double bonus();
}

abstract class Manager implements Salary
{
	int basic;

	Manager(int a)
	{
		basic = a;
	}

	public double earnings()
	{
		return basic + (0.8 * basic) + (0.15 * basic); 
	}

	public double deductions()
	{
		return 0.12 * basic;
	}
}

class Substaff extends Manager implements Salary
{

	Substaff(int a)
	{
		super(a);	
	}

	public double bonus()
	{
		return 0.5 * basic;
	}

}

public class Lab103
{
	public static void main(String args[])
	{
	    
		int basic_salary;
                System.out.println("Enter Basic Salary : ");
                Scanner sc=new Scanner(System.in);
                basic_salary=sc.nextInt();
		Salary s1 = new Substaff(basic_salary);
		System.out.println("Salary details of the substaff");
		s1.earnings();
		s1.deductions();
		s1.bonus();
		System.out.println("Basic Salary: " + basic_salary);
		System.out.println("Earning of the substaff: " + s1.earnings()); 
		System.out.println("Deduction of the substaff: " + s1.deductions()); 
		System.out.println("Bonus of the substaff: " + s1.bonus());
	}
}