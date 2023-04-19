public class LinearSearch {
    public static void main(String[] args)
    {
        String [] names={"Deepika","Anusha","Arundhathi","Deeksha","Ankitha","Anusha","Aparna"};
        String searchName=new java.util.Scanner(System.in).nextLine();
        for(int i=0;i<names.length;i++)
            if(names[i].contentEquals(searchName)){
                System.out.println("Found @"+(i+1));
                return;
            }
            System.out.println("Not Found");   
    }
}
