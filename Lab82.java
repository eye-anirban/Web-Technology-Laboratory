import java.util.Scanner;
class dim2
{
	Scanner sc = new Scanner(System.in);
	int length, breadth;
	int price;
	void getDim2D()
	{
		System.out.print("Enter length and breadth of the sheet:- ");
		length = sc.nextInt();
		breadth = sc.nextInt();
	}
	void price()
	{
		price = 40 * length * breadth;
		System.out.println("The price of 2d sheet is $" + price);
	}
}
class dim3 extends dim2{
	int height;
	void getHeight()
	{
		System.out.print("Enter height of the sheet:- ");
		height = sc.nextInt();
	}
	void price3d()
	{
		price = 60 * length * breadth * height;
		System.out.println("The price of 3d is $" + price);
	}
}
public class Lab82{
    public static void main(String[] args)
    {
        dim3 ob = new dim3();
		ob.getDim2D();
		ob.price();
		ob.getHeight();
		ob.price3d();
    }
}