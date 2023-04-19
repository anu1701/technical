public class SelectionSort {
    public static void main(String[] args){
        int[] arr={10,87,9,12,21};
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++)
                if(arr[minIndex]>arr[j])
                    minIndex=j;
            //checking whether minimum value is there
            if(minIndex!=i)
            //swapping array elements
                arr[i]=arr[i]+arr[minIndex]-(arr[minIndex]=arr[i]);
        }
        for(int index=0;index<arr.length;index++)
            System.out.print(arr[index]+" ");
    }
}
