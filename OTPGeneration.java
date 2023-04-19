import java.util.*;
public class OTPGeneration {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        long accNo=in.nextLong();
        int userOTP;
        String saccNo=""+accNo;
        String OTP="";
        //Generating OTP
        for(int i=1;i<=6;i++)
            OTP+=saccNo.charAt((int)(Math.random()*saccNo.length()));
        System.out.println("OTP:"+OTP);
        for(int i=1;i<=3;i++){
            System.out.println("Enter OTP:");
            userOTP=in.nextInt();
            if(userOTP==Integer.parseInt(OTP)){
                System.out.println("Transaction Successful!");
                System.exit(0);
            }
            else
            System.out.println("Invalid OTP!");
        }
        System.out.println("3 attempts are over.Transaction failed!");
    }
}
