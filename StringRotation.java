import java.util.Arrays;
import java.util.Scanner;
public class StringRotation {
    private static boolean isAnagram(String x,String y){
        char[] str1=x.toCharArray();
        char[] str2=y.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return new String(str1).equals(new String(str2));
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.next();
        int n=in.nextInt();
        String firstCharString="",originalString=str;
        for(int i=1;i<=n;i++){
            String dir=in.next();
            int x=in.nextInt();
            if(dir.equalsIgnoreCase("L"))
            str=str.substring(x)+str.substring(0,x);
            else if(dir.equalsIgnoreCase("R"))
            str=str.substring(str.length()-x)+str.substring(0,str.length()-x);
            firstCharString+=str.charAt(0);
        }
        //finding substring of the original string
        for(int i=0;i<originalString.length()-n;i++){
            if(isAnagram(originalString.substring(i,i+n),firstCharString)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
