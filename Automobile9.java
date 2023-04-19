import java.util.Scanner;
public class Automobile9 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int v=s.nextInt();
        int w=s.nextInt();
        int FW,TW;
        TW=((4*v)-w)/2;
        FW=v-TW;
        if(w>=2 && (w%2==0) && v<w)
            System.out.println("TW="+TW+"\t"+"FW="+FW);
        else
        System.out.println("INVALID INPUT");
    }
}
