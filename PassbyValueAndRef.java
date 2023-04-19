public class PassbyValueAndRef {
    static void passbyvalue(int a,int b)
    {
        a=(a+b)-(b=a);
    }
    static void passbyref(int a,int b)
    {
        a=(a+b)-(b=a);
    }
    public static void main(String[] args){
        int x=10,y=20;
        Integer a=10,b=20;
        passbyvalue(x,y);
        System.out.println(x+" "+y);
        passbyref(a,b);
        System.out.println(a+" "+b);
    }
}
