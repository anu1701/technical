public class InsertionSort {
    public static void main(String[] args){
        int[] arr={10,87,9,12,21};
        for(int i=1;i<arr.length;i++){
            int key=arr[i],j;
            //finding key position to be inserted
            for(j=i-1;j>=0 && arr[j]>key;j--)
                arr[j+1]=arr[j];
            arr[j+1]=key;
        }
        //printing the sorted array element
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
