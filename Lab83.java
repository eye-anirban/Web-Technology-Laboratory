import java.util.*;
class emp
{
	int emp_id, dept_id,n;
	float le_amt;
	void get_data()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee-ID - ");
		emp_id = sc.nextInt();
		System.out.print("Enter Department ID - ");
		dept_id = sc.nextInt();
		System.out.print("Enter number of half-days - ");
		n = sc.nextInt();
	}
}
class manager extends emp
{
	void show_data()
	{
		System.out.println("---------------Manager Details----------------");
		get_data();
		le_amt = 200 * n;
		System.out.println("Employee-ID - "+emp_id);
		System.out.println("Department-ID - "+dept_id);
		System.out.println("No. of half-days - "+n);
		System.out.println("Leave Encashment Amount = Rs."+le_amt);
	}
}
class worker extends emp
{
	void show_data()
	{
		System.out.println("---------------Worker Details----------------");
		get_data();
		le_amt = 300 * (2*n);
		System.out.println("Employee-ID - "+emp_id);
		System.out.println("Department-ID - "+dept_id);
		System.out.println("No. of days - "+(n/2));
		System.out.println("Leave Encashment Amount = Rs."+le_amt);
	}
}
class others extends emp
{
	void show_data()
	{
		System.out.println("---------------Other Emp Details----------------");
		get_data();
		le_amt = 200 * (2*n);
		System.out.println("Employee-ID - "+emp_id);
		System.out.println("Department-ID - "+dept_id);
		System.out.println("No. of days - "+(n/2));
		System.out.println("Leave Encashment Amount = Rs."+le_amt);
	}
}
public class Lab83
{
	public static void main(String args[])
	{
		manager m = new manager();
		worker w = new worker();
		others o = new others();
		m.show_data();
		w.show_data();
		o.show_data();
	}
}
