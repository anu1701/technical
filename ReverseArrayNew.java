import java.util.Scanner;
public class ReverseArrayNew {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        //int[] arrSize;
        //arrSize=in.nextInt();
        //arr=new int[arrSize];
        //arr=in.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0,j=arr.length-1;i<j;i++,j--)
        {
            arr[i]=(arr[i]+arr[j])-(arr[j]=arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

