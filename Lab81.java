import java.util.*;
class Student{
	int Rollno;
	String Course;
	Student(int rollno)
	{
		Rollno = rollno;
	}
	void register(String Course)
	{
		this.Course = Course;
	}
}
class Kiitian extends Student{
	Scanner sc = new Scanner(System.in);
	String is_required;
	Kiitian(int roll)
	{
		super(roll);
	}
	void hostelRequest()
	{
		System.out.print("IS HOSTEL REQUIRED:- ");
		is_required = sc.next();
	}
}

public class Lab81
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Give Roll no:- ");
		int roll = sc.nextInt();
		Kiitian stu1 = new Kiitian(roll);
		System.out.print("Enter the Course selected:- ");
		String str = sc.next();
		stu1.register(str);
		stu1.hostelRequest();
		System.out.println("The roll of the student is :- " + stu1.Rollno);
		System.out.println("The Course of the student is :- " + stu1.Course);
		System.out.println("Is hostel :- " + stu1.is_required);
	}
}