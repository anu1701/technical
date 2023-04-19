import java.util.Scanner;
public class ReverseArray {
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
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
//we can do it by swapping the indexes
//x=(x+y)-(y=x) or using temporary variable
