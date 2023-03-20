import java.util.*;
class Lab132
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter 2 strings - ");
String s1 = sc.next();
String s2 = sc.next();

String s3 = s1+s2;
System.out.println("Appending '"+s1+"' and '"+s2+"' we get - '"+s3+"'");   // ....(i)

System.out.println("Choose a substring from '"+s1+"' -");
String s7 = sc.next();
s3 = s1.replace(s7,s2);
System.out.println("Replacing substring '"+s7+"' from '"+s1+"',with '"+s2+"' we get - '"+s3+"'"); // ....(ii)

s3 = s2.replace('a', 'b');
System.out.println(s3); // ...(iii)

System.out.print("Eneter the index where to insert a string :- ");
int i;
i = sc.nextInt();
String s4 = s1.substring(0,i-1);
String s5 = s2;
String s6 = s1.substring(i-1);
s3 = s4+s5+s6;
System.out.println(s3);
}
}