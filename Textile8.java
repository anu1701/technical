import java.util.Scanner;
public class Textile8{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n,i,j,pair=0,unique=0;
        n=s.nextInt();
        int[] ar=new int[n];
        int[] new_ar=new int[n];
        for(i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }
        //for loop for seperating repeating numbers
        for(i=0; i<n; i++)
        {
            int count = 0;
            for(j=i+1;j<=i;j++)
            {
                if(ar[i]==ar[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                new_ar[unique] = ar[i];
                unique++;
            }
        }
        //to find the pairs
        for(i=0; i<unique; i++)
        {
            int count = 0;
            for(j=0; j<n; j++)
            {
                if(new_ar[i]==ar[j])
                {
                    count++;
                }
            }
            pair = pair + (count/2);  
        }
        System.out.println("Pairs="+pair);
    }
}