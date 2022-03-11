import java.util.Queue;
import java.util.Scanner;
public class QueueImplementation {
    int[] queue = new int[10];
    int front = -1;
    int rear = -1;
    void Enqueue(int val){
        if(rear >= queue.length){
            System.out.println("No Space In Queue");
            return;
        }
        rear++;
        queue[rear] = val;
        if(front == -1)
        front++;
    }
    void dequeue(){
        if(front == rear+1){
            System.out.println("Queue Is empty");
            front = -1;
            rear = -1;
            return;
        }
        if(front == -1 && rear == -1){
            System.out.println("Queue Is empty");
            return;
        }
        front++;
    }
    void traverse(){
        if(front == rear+1){
            System.out.println("Queue Is empty");
            return;
        }
        if(front == -1 && rear == -1){
            System.out.println("Queue Is empty");
            return;
        } 
        System.out.print("Elements are");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueImplementation ob = new QueueImplementation();
        while(true){
            System.out.println("TO ENQUEUE PRESS 1");
            System.out.println("TO DEQUEUE PRESS 2");
            System.out.println("TO SHOW PRESS 3");
            System.out.println("TO EXIT PRESS 0");
            int op = sc.nextInt();
            if(op == 1){
                System.out.println("Enter data to be enqueue");
                int data = sc.nextInt();
                ob.Enqueue(data);
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
