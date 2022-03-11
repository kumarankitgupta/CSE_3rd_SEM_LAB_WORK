import java.util.Arrays;
public class Mergeshort {
    public static int[] merge(int[] left,int[] right){
       int b[] = new int[left.length+right.length];
       int i=0;
       int j=0;
       int k=0;
       while(i<left.length&&j<right.length)
       {
           if(left[i]<right[j]){
               b[k]=left[i];
               i++;
           }
           else{
               b[k]=right[j];
               j++;
           }
           k++;
       }
       if(i<left.length){
           while(i<left.length){
               b[k]=left[i];
               i++;
               k++;
           }
       }
       else{
        while(j<right.length){
            b[k]=right[j];
            j++;
            k++;
        }
       }
       
        return b;

    }

    
    public static void main(String[] args) {
        int arr[] = {15,5,24,8,1,3,16,10,20};
        arr=mergesort(arr);
        System.out.println(Arrays.toString(arr));

    }


    private static int[] mergesort(int[] a) {
        if(a.length==1)
        {
            return a;
        }
        int mid = a.length/2;
        int[] left = mergesort(Arrays.copyOfRange(a, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(a, mid, a.length));

        return merge(left, right);
    }
}
