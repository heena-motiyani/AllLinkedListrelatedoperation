class Node{
    int data;
    Node next;
}

public class MyLinkedList {
    Node head;
    int size;
//insert at last
    void insert(Node newnode) {
        System.out.println("inserting new node " + newnode.data);
        if (head == null)
            head = newnode;
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newnode;
        }

    }
    void insertAtFirst(Node newnode)
    {
        System.out.println("inserting new node at beginning "+newnode.data);

            newnode.next = head;
            head = newnode;

    }
    //delete from last
    void delete(){
        if(head==null){
            System.out.println("empty list");
        }
        else
        {
            Node current = head;
            Node previous = null;

            while (current.next != null)
            {
                previous = current;
                current = current.next;
            }
            System.out.println("deleting last node "+current.data);
            previous.next = null;
        }

    }
    void deleteFrombeginning(){
        if(head!=null)
        System.out.println(head.data);
        else
        head = head.next;
    }
    void insertbefore(Node newnode,Node beforenode)//assume node is present before we want to insert
    {
        Node current=head;
        Node pre=null;

        while(current.data!=beforenode.data)
        {
            pre=current;
            current=current.next;
        }
        newnode.next = pre.next;
        pre.next=newnode;
    }

    void display() {
        System.out.println("MyLinkedList:");
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--->");
            temp = temp.next;

        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        MyLinkedList linkedlist = new MyLinkedList();
        Node newnode = new Node();

        newnode.data = 10;
        newnode.next = null;
        Node n1 = new Node();
        n1.data = 454;
        n1.next = null;

        Node n2 = new Node();
        n2.data = 345;
        n2.next = null;

        Node n3 = new Node();
        n3.data = 987;
        n3.next = null;
        Node n4 = new Node();
        n4.data = 67;
        n4.next = null;
        Node n6 = new Node();
        n6.data = 34;
        n6.next = null;

      linkedlist.insert(newnode);
      linkedlist.insert(n1);
      linkedlist.insert(n2);
      linkedlist.insert(n3);
      linkedlist.insertAtFirst(n4);
      linkedlist.delete();
      linkedlist.deleteFrombeginning();
      linkedlist.insertbefore(n6,n2);

      linkedlist.display();








    }
}