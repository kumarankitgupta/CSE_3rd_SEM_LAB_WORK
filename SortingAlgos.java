import java.util.*;

public class SortingAlgos {
    public static int[] selection_sort(int arr[]) {
        for(int i=0 ; i<arr.length-1;i++)
        {   int min=i;
            for(int j=i+1;j<arr.length;j++)
            {   
                if(arr[min]>arr[j])
                {   
                    min=j;
                }
            }
            int swap=arr[i];
            arr[i]=arr[min];
            arr[min]=swap;
            
        }
        return arr;
    }

    public static int[] bubble_sort(int a[]) {
		for(int i =a.length;i>=0;i--)
	{
		for(int j=0;j<i-1;j++)
		{
			if(a[j]>a[j+1]){
				int swap = a[j];
                a[j]=a[j+1];
                a[j+1]=swap;
			}
		}
	}
		return a;
	}
    
    public static void ins_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j =i-1;
            while (j>=0 && arr[j]>temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
           
        }
        System.out.println("By insertion Sorting Method :");
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        // insertion sort 
        int[] arr = {48,52,41,74,36,12,14,15,16,8,2,4,14,69,74,64,36,14,4};
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arr));
        ins_sort(arr);

        
        // selection sort
        System.out.println("Before sorting : "+Arrays.toString(arr));
        arr = selection_sort(arr); 
        System.out.println("After sorting : "+Arrays.toString(arr));


        // bubble sort
        int[] barr = {9,8,7,6,5,4,3,2,1,0};
	    barr=bubble_sort(barr);
		System.out.print(Arrays.toString(barr));

    }
}
