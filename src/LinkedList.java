import java.util.Stack;

public class LinkedList {
    class Node{
        int value;
        Node next;

        public Node(int value)
        {
            this.value = value;
            this.next = null;
        }
    }
    Node head = null;

    public void insert(int value)
    {
        Node node1 = new Node(value);
        if(head==null)
        {
            head = node1;
        }
        else{
                node1.next = head;
                head = node1;
        }
    }

    public void insertLast(int value)
    {
         Node node2 = new Node(value);
         Node curr2 = head;
         while(curr2.next !=null)
         {
             curr2 = curr2.next;
         }
         curr2.next = node2;
    }



    public void insertAt(int value, int pos) {
     Node n3 = new Node(value);
     Node curr = head;
     if(pos==0 && head!=null)
     {
         n3.next = head;
         head = n3;
     }
     else{
         while(--pos>=1)
         {
             curr =curr.next;
         }
         n3.next = curr.next;
         curr.next = n3;
     }
    }
    public void deleteAt(int pos)
    {
         Node curr = head;
         if(pos==0)
         {
             head = curr.next;
         }
         while(--pos>=1)
         {
             curr = curr.next;
         }
         curr.next = curr.next.next;
    }
    public void deleteFirst()
    {
        Node curr =head;
        head = curr.next;
    }

    public void palindrome() {
        Stack<Integer> stack = new Stack<>();
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            stack.push(slow.value);
            slow = slow.next;
            fast = fast.next.next;
        }
        //System.out.println(s1);
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        while (slow != null) {
            if (stack.isEmpty() || stack.pop() != slow.value) {
                System.out.println("Not palindrome");
                return;
            }
            slow = slow.next;
        }
        System.out.println("Palindrome");
    }

        public void deleteLast()
    {
        Node curr =head;
        Node temp = null;
        while(curr.next!=null)
        {
            temp = curr;
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
    }
    public void display()
    {
        Node curr = head;
        if(head == null)
        {
            System.out.println("Empty list");
        }
        else{
            while(curr!=null)
            {
                System.out.print(curr.value+"->");
                curr = curr.next;
            }
        }
        System.out.println("Null");
    }
    public Node reverse()
    {
        Node curr = head;
        Node next = null;
        Node prev = null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node reverse1(Node node)
    {
        Node curr =head;
        if(node.next ==null)
        {
            return node;
        }
        Node newnode = reverse1(node.next);
        node.next.next = node;
        node.next = null;
        return newnode;

    }
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.insert(20);
        LL.insert(21);
        LL.insert(22);
        LL.insertAt(24,2);
        //LL.deleteAt(1);
        //LL.deleteFirst();
        //LL.deleteLast();
        //LL.deleteLast();
        LL.palindrome();
        //LL.head = LL.reverse();
          //LL.head = LL.reverse1(LL.head);

        //System.out.println(LL.middle());
        LL.display();

    }
}
