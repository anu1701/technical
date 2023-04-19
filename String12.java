import javax.lang.model.util.ElementScanner14;

public class String12 {
    public static void main(String[] args)
    {
        String Str=new java.util.Scanner(System.in).next();
        int counts=0,counth=0;
        for(int i=0;i<Str.length();i++)
        {
            if(Str.charAt(i)=='*')
                counts++;
            if(Str.charAt(i)=='#')
                counth++;
        }
        if(counts==counth)
            System.out.println("0");
        else if(counts>counth)
            System.out.println(counts-counth);
        else
            System.out.println(counts-counth);   
        }
}
