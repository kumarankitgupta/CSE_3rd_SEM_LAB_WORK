import java.util.Arrays;
public class bubblesort {
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

   public static void main(String[] args) {
	     int[] arr = {9,8,7,6,5,4,3,2,1,0};
	     arr=bubble_sort(arr);
		System.out.print(Arrays.toString(arr));
   }

}
