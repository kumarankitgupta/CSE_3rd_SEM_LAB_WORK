import java.util.Scanner;
public class StackImplementation {
    int[] arr = new int[10];
    int top = -1;
    void push(int val){
        if(top >= arr.length){
            System.out.println("No Space In Stack");
            return;
        }
        arr[++top] = val;
    }
    void pop(){
        if(top == -1){
            System.out.println("UnderFlow");
            return;
        }
        top--;
    }
    void show(){
        if(top == -1){
            System.out.println("UnderFlow");
            return;
        }
        System.out.print("Elements Are :- ");
        for (int i = 0; i <=top; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackImplementation ob = new StackImplementation();
        while(true){
            System.out.println("* FOR PUSH PRESS 1");
            System.out.println("* FOR POP  PRESS 2");
            System.out.println("* FOR SHOW PRESS 3");
            System.out.println("* FOR EXIT PRESS 0");
            int op = sc.nextInt();
            if(op == 1){
                System.out.println("Enter Data to be Pushed in Stack");
                int num = sc.nextInt();
                ob.push(num);
                System.out.println(ob.arr[ob.top]+" Sucessfully Pushed");
            }
            else if(op == 2){
                ob.pop();
            }
            else if(op == 3){
                ob.show();
            }
            else if(op == 0){
                return;
            }
            else{
                System.out.println("Wrong Option");
            } 
        }
    }
}
