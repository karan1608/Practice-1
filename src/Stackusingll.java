public class Stackusingll {
    class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void insertFirst(int data)
    {
        Node newnode = new Node(data);
        if(head == null)
        {
            head = newnode;
            tail = newnode;
        }else
        {
            newnode.next = head;
            head = newnode;
            tail = head.next;
        }
    }
    public void display()
    {
        Node newnode1 = head;
        if(head == null)
        {
            System.out.println("List is Empty");
        }
        else {
            while (newnode1 != null) {
                System.out.print(newnode1.data + "->");
                newnode1 = newnode1.next;
            }
        }
        System.out.println("Null");
    }
    public void deletefirst(){
        Node newnode2 = head;
        head = newnode2.next;
    }
    public void peek()
    {
        Node newnode3 = head;
        System.out.println(newnode3.data);
    }
    public static void main(String[] args) {
        Stackusingll ll = new Stackusingll();
        ll.insertFirst(10);
        ll.insertFirst(90);
        ll.insertFirst(70);
        ll.insertFirst(100);
        ll.peek();
        ll.display();
        //ll.display();
    }
}
