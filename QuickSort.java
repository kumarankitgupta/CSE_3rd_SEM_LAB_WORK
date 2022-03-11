import java.util.Arrays;
public class QuickSort {

    public static void quicksort(int[] a , int lb ,int ub) {
        if(lb<ub)
        {
        int loc = divide(a,lb,ub);
        quicksort(a, lb, loc-1);
        quicksort(a, loc+1, ub);
        
        }
    }   
    public static int divide(int[] a ,int lb, int ub) {
        int pivot = a[lb];
        int start = lb, end = ub;
        while(start<end)
        { 
            while(a[start]<=pivot&&start<a.length-1)
            {
                start++;
            }
            while(a[end]>pivot)
            {
                end--;
            }
            if(start<end){
                int temp = a[start];
                a[start]=a[end];
                a[end]=temp;
            }
        }
         int t = a[lb];
         a[lb]=a[end];
         a[end]=t;
         return end;
    } 

    
    public static void main(String[] args) {
        int[] arr ={7,5,4,7,2,14,5,5,12,22,6,6,2,1,1};
        System.out.println("Before sorting : "+ Arrays.toString(arr));
        quicksort(arr, 0, arr.length-1);
        System.out.println("After sorting : "+ Arrays.toString(arr));

        
    }}