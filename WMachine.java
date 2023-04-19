import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class WMachine {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int w=s.nextInt();
        if(w==0)
            System.out.println("Time Estimated:0 Minutes");
        else if(w>0 && w<=2000)
            System.out.println("Time Estimated:25 Minutes");
        else if(w>2000 && w<=4000)
            System.out.println("Time Estimated:35 Minutes");
        else if(w>4000 && w<=7000)
            System.out.println("Time Estimated:45 Minutes");
        else
            System.out.println("OVERLOADED,INVALID INPUT");

    }
}
