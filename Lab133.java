import java.util.*;
class Lab133 {
    static int isSubstring(
        String s1, String s2)
    {
        int M = s1.length();
        int N = s2.length();
        for (int i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++)
                {
                    if (s2.charAt(i + j)
                    != s1.charAt(j))
                    break;
                }
            if (j == M)
                    return i;
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 strings : \n");
        
        String s1 = sc.next();
        String s2 = sc.next();

        int res = isSubstring(s1, s2);

		if (res == -1)
			System.out.println("Not present");
		else
			System.out.println("Present at index "+ res);
	}
}