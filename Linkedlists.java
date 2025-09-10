public class Linkedlists {
    public static void main(String[] args)
     {
        Linkedlist a = new Linkedlist();
        a.insertAtBegin(100);
        a.insertAtBegin(120);
        a.insertAtBegin(110);
        a.insertAtBegin(130);
        a.insertAtBegin(140);
        a.display();
        a.deleteAtBegin();
        a.display();
        a.insertAtPos(3, 150);
        a.display();
    }
}
class Linkedlist {
    Node head;
    class Node
     {
        int data;
        Node next;
        Node(int val)
         {
            data = val;
            next = null;
        }
    }
    public Linkedlist() 
    {
        head = null;
    }
    public void insertAtBegin(int val)
     {
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
    }
    public void deleteAtBegin()
     {
        if (head != null) 
        {
            head = head.next;
        }
    }
    public void insertAtPos(int pos, int val) 
    {
        if (pos <= 0) 
        {
            System.out.println("Invalid position.");
            return;
        }
        Node newnode = new Node(val);
        if (pos == 1)
         {
            newnode.next = head;
            head = newnode;
            return;
        }
        Node temp = head;
        int count = 1;
        while (temp != null && count < pos - 1)
         {
            temp = temp.next;
            count++;
        }
        if (temp == null)
         {
            System.out.println("Position out of bounds.");
        } 
        else
         {
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

