public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        //step 1:-create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        //step 2:-newNode next=head
        newNode.next = head; //link

        //step 3:- head=newNode
        head = newNode;

    }

    //addLast
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    //Add in middle




    public int helper(Node head,int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) ;
        {
            return -1;

        }
        
    }
    

    public int recSearch(int key){
        return helper(head,key);
    }


    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }





            public static void main(String[] args) {
                LinkedList ll = new LinkedList();
                ll.addFirst(2);
                ll.print();
                ll.addFirst(1);
                ll.print();
                ll.addLast(3);
                ll.print();
                ll.addLast(4);
                ll.print();


                System.out.println(ll.recSearch(3));
                System.out.println(ll.recSearch(10));


            }


}

