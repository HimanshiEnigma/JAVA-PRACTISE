 public boolean checkPalindrome(){
        if(head==null||head.next==null){
            return true;
        }
        //step 1-Find mid
        Node midNode=findMid(head);
        //step 2-reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        Node right=prev;
        Node left=head;

        //step-3 check left half & right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

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
                ll.addLast(1);
                ll.addLast(2);
                ll.addLast(2);
                ll.addLast(1);


                ll.print();


        System.out.println(ll.checkPalindrome());
       

            }
}
