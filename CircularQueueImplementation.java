import java.util.Scanner;

/**
 * CircularQueueImplementation
 */
public class CircularQueueImplementation {
    int size = 10;
    int[] queue = new int[size];
    int front = -1;
    int rear = -1;
    void enqueue(int val){
        if(front == -1 && rear == -1){
            front = 0;
            rear = 0;
            queue[rear] = val;
            return;
        }
        else if((rear + 1) % size == front){
            System.out.println("Queue is Full");
            return;
        }
        else{
            rear  = (rear + 1) % size;
            queue[rear] = val;
        }
    }
    void dequeue(){
        if(front == -1 && rear == -1){
            System.out.println("Queue is emepty");
        }
        else if(front == rear){
            front = -1;
            rear = -1;
        }
        else{
            front = (front + 1)  % size ;
        }
    }
    void traverse(){
        if(front == -1 && rear == -1){
            System.out.println("Queue is emepty");
        }
        else{
            int i = front;
            System.out.print("Elements are :- ");
            while(i != rear){
                System.out.print(queue[i]+" ");
                i  = (i + 1) % size;
            }
            System.out.println(queue[rear]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueueImplementation ob = new CircularQueueImplementation();
        while(true){
            System.out.println("TO ENQUEUE PRESS 1");
            System.out.println("TO DEQUEUE PRESS 2");
            System.out.println("TO SHOW PRESS 3");
            System.out.println("TO EXIT PRESS 0");
            int op = sc.nextInt();
            if(op == 1){
                System.out.println("Enter data to be enqueue");
                int data = sc.nextInt();
                ob.enqueue(data);
                System.out.println(ob.queue[ob.rear]+" successfully enqued");
            }
            else if(op == 2){
                ob.dequeue();
            }
            else if(op == 3){
                ob.traverse();
            }
            else if(op == 0){
                return;
            }
            else{
                System.out.println("invalid option");
            }
            
        }
    }
}