import java.util.*;
class Lab63{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 numbers :\n");
		String aaa = sc.next();
		String bbb = sc.next();
		char [] aa = aaa.toCharArray();
		char [] bb = bbb.toCharArray();
		Arrays.sort(aa);
		Arrays.sort(bb);
		String a = new String(aa);
		String b = new String(bb);
		int a1 = a.length();
		int b1 = b.length();
		System.out.println("The common digits in the the numbers are : ");
		for(int i=0;i<a1;++i)
		{
			for(int j=0; j < b1; ++j){
				int c =  a.charAt(i) - '0';
				int d = b.charAt(j) - '0';
				if(c == d) System.out.print(c + " ");
			}
		}
		System.out.println();
	}
}