import java.util.Scanner;
interface Motor
{
    int capacity=100;
    void run();
    void consume();
}
class Washing_machine implements Motor
{
    public void run()
    {
        System.out.println("Run Method is printed\n");
    }
    public void consume()
    {
        System.out.println("Consume Method is printed\n");
    }
}

public class Lab102
{
	public static void main(String args[]) 
	{
		Motor m1 = new Washing_machine();
		System.out.println("Value of the interface variable: " + m1.capacity);
		m1.run();
		m1.consume();
	}
}