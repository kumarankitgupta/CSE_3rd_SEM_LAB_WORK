import java.util.Arrays;
import java.util.Scanner;
public class OperationOArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0 ;
        int[] arr = new int[10];
        Arrays.fill(arr , 0);
        while (true) {
                System.out.println("Enter option :-");
                System.out.println("* TO INSERT PRESS 1");
                System.out.println("* TO DELETE PRESS 2");
                System.out.println("* TO SEARCH PRESS 3");
                System.out.println("* TO EXIT   PRESS 0");
                System.out.println("* TO SHOW   PRESS 4");
                int ch = sc.nextInt() ;
                switch (ch){
                    case 1 :
                     if(pos<10){
                        System.out.println("Enter the number to insert");
                        int num = sc.nextInt();
                        arr[pos] = num;
                        System.out.println(arr[pos]+" inserted Successfully");
                        pos++;
                     }else{
                         System.out.println("Array is full");
                     }
                     break;
                     case 2 :
                     if(pos==0){
                         System.out.println("Array is Empty");
                     }else{
                         System.out.println("Enter position to delete");
                         int position = sc.nextInt();
                         arr[position-1] = 0;
                         System.out.println("ITEM DELETED");
                     }
                     break;
                     case 3:
                     if(pos == 0){
                        System.out.println("Array is Empty");
                     }else{
                         System.out.println("Enter element to be searched");
                         int s = sc.nextInt();
                        int i ;
                        for (i = 0; i < arr.length; i++) {
                            if(arr[i] == s){
                                break;
                            }
                        }
                        if(i<arr.length)
                        System.out.println("Found At postion "+ (i+1));
                        else
                        System.out.println("Not Found");
                     }
                     break;
                    case 4 :
                   if(pos == 0){
                       System.out.println("No elements");
                   }else{
                    System.out.println( Arrays.toString(arr));
                   }
                    break;
                    case 0 : return;
                     default :
                     System.out.println("Invalid Option");  
                     break;
                }
        }
    }
    
}