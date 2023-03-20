import java.util.Scanner;
public class Lab72{
    public static void main(String[] args)
    {
        int m,n;
		int a[][] = new int [100][100];
		int b[][] = new int [100][100];
		int c[][] = new int [100][100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rowsize of matrix");
		m = sc.nextInt();
		System.out.println("Enter columnsize of matrix");
		n = sc.nextInt();
		int i,j;
		System.out.println("Enter elements for matrix 1 :");
		for(i=1;i<=m;i++)
		{
			for(j=1;j<=n;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Displaying, matrix 1 :");
		for(i=1;i<=m;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter elements for matrix 2 :");
		for(i=1;i<=m;i++)
		{
			for(j=1;j<=n;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Displaying, matrix 2 :");
		for(i=1;i<=m;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		for(i=1;i<=m;i++)
		{
			for(j=1;j<=n;j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("Displaying, sum of matrices 1 and 2 :");
		for(i=1;i<=m;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
}
}