import java.util.Scanner;
public class Supermarket9 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int temp,price=1;
        while(N>0)
        {
            temp=N%10;
            price=price*temp;
            N=N/10;
        }
        System.out.println("Price="+price);
    }
}
