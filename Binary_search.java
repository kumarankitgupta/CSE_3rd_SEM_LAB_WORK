import java.util.Arrays;

import java.util.Scanner;
public class Binary_search {
    public static int binary_search(int arr[],int find) {
        int mid ,start = 0, end = arr.length-1;
        while(start <= end)
        {   
            mid = (start + end )/2;
            if(arr[mid] == find){
                return mid;
            }
            else if(find > arr[mid]){
                start = mid +1;
            }
            else 
                end = mid -1; 
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int[] arr = {12,34,67,89,123,678,900};
        System.out.println(Arrays.toString(arr));
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enetr the Search element ");
            int find = in.nextInt();
            int result = binary_search(arr,find);
            if(result!=-1)
            System.out.println("Found at position "+ (++result));
            else
            System.out.println("Not Found");
        }

    }
}
