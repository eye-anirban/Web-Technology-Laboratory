import java.util.*;
class Bank
{
	double roi,temp=1.5;
	void find_ROI()
	{
		System.out.println("\n---------------Bank Class----------------\n");
		System.out.println("To find rate of interest");
	}
}
class HDFC extends Bank
{
	void find_ROI()
	{
		System.out.println("\n---------------HDFC Class----------------\n");
		double AP;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter last year annual profit(in crores) - ");
		AP = sc.nextDouble();
		roi = AP/temp;
		System.out.printf("Rate of Interest in HDFC - %.2f",roi);
	}
}
class ICICI extends Bank
{
	void find_ROI()
	{
		System.out.println("\n---------------ICICI Class----------------\n");
		double fund;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter fund supported by RBI (in crores) - ");
		fund = sc.nextDouble();
		roi = fund/temp;
		System.out.printf("Rate of Interest in ICICI - %.2f\n",roi);
	}
}
public class Lab92
{
	public static void main(String args[])
	{
		Bank ob1 = new Bank();
		HDFC ob2 = new HDFC();
		ICICI ob3 = new ICICI();
		Bank ob4;
		ob4 = ob1;
		ob1.find_ROI();
		ob4 = ob2;
		ob4.find_ROI();
		ob4 = ob3;
		ob4.find_ROI();
	}
}
