public class Lab112 {
    
    public static void main(String[] args) {
        int a[]={3,4,6,1};
        try
        {
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
    
}