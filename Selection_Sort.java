import java.util.*;
public class Selection_Sort {
    public static int min_index(int arr[],int from_index) {
        int min=from_index;
        for(int i = from_index+1;i<arr.length;i++)
        {
            if(arr[min]>arr[i])
            {   
                min=i;
            }
        }
        return min;
        
    }

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
    
    public static void main(String[] args) {
        int[] arr = {7,4,10,8,3,1};
        System.out.println("Before sorting : "+Arrays.toString(arr));
        System.out.println("index minimum = "+min_index(arr, 0));
        arr = selection_sort(arr); 
        System.out.println("After sorting : "+Arrays.toString(arr));
        System.out.println("index minimum = "+min_index(arr, 4));

    }
}
