import java.util.Scanner;
public class CFactory {
   public static void main(String[] args)
   {
    Scanner s=new Scanner(System.in);
    int i;
    int N=s.nextInt();
    int[] ar=new int[N];
    for(i=0;i<ar.length;i++)
    {
        ar[i]=s.nextInt();
        System.out.println();
    }
    int count=0;
    for(i=0;i<N;i++)
    {
        if (ar[i]!=0)
	        ar[count++]=ar[i];
    }
    for(i=count;i<N;i++)
        ar[i] = 0;
    for(i=0;i<N;i++)
        System.out.print(ar[i]);
   } 
}
