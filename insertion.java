import java.util.*;
class insertion{
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
        int[] arr = {48,52,41,74,36,12,14,15,16,8,2,4,14,69,74,64,36,14,4};
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arr));
        ins_sort(arr);
    }
}