
class LinkedList{
    node head=null;
    class node{
        int data;
        node next;

        node(int val){
            this.data = val;
            this.next = null;
        }
    }

    public void addLast(int val) {
        node newnode = new node(val);
        if(head==null){
            head = newnode;
            return;
    }
    node temp = head;
    while(temp.next!=null){
        temp = temp.next;
    }
    temp.next = newnode;
}
    public void printlist() {
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void addFirst(int val) {
        node newnode = new node(val);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void DeleteFirst() {
        if(head == null){
            System.out.println("No Elements to Delete");
            return;
        }
        head = head.next;
    }

    public void DeleteLast() {
        if(head == null){
            System.out.println("No Elements to Delete");
            return;
        }
        node prev=null, temp = head;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next=null;
    }




    public static void main(String[] args) {
        LinkedList  ll = new LinkedList();
        System.out.println("Linked List in java");
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.printlist();
        ll.addFirst(9);
        ll.addFirst(4);
        ll.printlist();
        ll.DeleteFirst();
        ll.printlist();
        ll.DeleteLast();
        ll.printlist();
    }

}


