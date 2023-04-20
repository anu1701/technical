//oops package
public class MyDate {
    //instance variables or data members or atates or properties or attributes or fields of relation
    private int dd,mm,yy;
    //class or static variables
    static int cnt;

    //Default Constructor
    public MyDate(){
        dd=1;mm=1;yy=1900;
    }

    //Parameterized Constructor
    public MyDate(int d,int m,int y){
        setDate(d, m, y);
    }


    //methods
    private boolean isLeapYear(int y){
        return (y%400==0||(y%4==0&&y%100!=0));
    }
    private boolean isValid(int d,int m,int y){
        if(d>31||d<1||m>12||m<1||y<1)
            return false;
        else{
            switch(m){
                case 4:case 6:case 9:case 11:
                    if(d>30) return false;
                    break;
                case 2:
                    if(isLeapYear(y)){
                        if(d>29) return false;
                    }
                    else if(d>28) return false;
            }
            return true;
        }
    }
    public void setDate(int d,int m, int y) throws NullPointerException{
        if(isValid(d, m, y)){
            dd=d;
            mm=m;
            yy=y;
        }
        else
            throw new NullPointerException("Invalid Date!");
    }
    public String toString(){
        return dd+"/"+mm+"/"+yy;
    }
}
