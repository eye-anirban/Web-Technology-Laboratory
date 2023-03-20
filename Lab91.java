import java.util.*;
class Employee
{
	int emp_id;
	float basic,DA,total;
	void get_data()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Employee-ID - ");
		emp_id = sc.nextInt();
		System.out.print("Enter Basic Pay - ");
		basic = sc.nextFloat();
		System.out.print("Enter DA - ");
		DA = sc.nextFloat();
	}
	void salary()
	{
		get_data();
		System.out.println("---------------Employee Details----------------");
		System.out.println("Employee-ID - "+emp_id);
		System.out.println("Basic pay - Rs. "+basic);
		System.out.println("DA - Rs. "+DA);
		total = basic + DA;
		System.out.println("Total Salary - Rs. "+total);
	}
}
class manager extends Employee
{
	void salary()
	{
		float TA;
		System.out.println("---------------Manager Details----------------");
		System.out.println("Employee-ID - "+emp_id);
		System.out.println("Basic pay - Rs. "+basic);
		System.out.println("DA - Rs. "+DA);
		TA = 0.1f*basic;
		total = basic + DA + TA;
		System.out.println("Total Salary - Rs. "+total);
		super.salary();
	}
}
public class Lab91
{
	public static void main(String args[])
	{
		manager m = new manager();
		m.get_data();
		m.salary();
	}
}
