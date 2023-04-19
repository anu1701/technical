import java.util.Scanner;
public class Natural {
    static void printNaturalNumbersusingRecursion(int n){
        if(n==0)
            return;
        printNaturalNumbersusingRecursion(n-1);
        System.out.print(" "+n);
    }
public static void main(String[] args) 
{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    printNaturalNumbersusingRecursion(n);
}
}