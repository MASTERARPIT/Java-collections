public class Linkedlistdesign {
    Node head;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            
        }
    }
    public Linkedlistdesign insert(Linkedlistdesign list1,int data){
        Node newnode=new Node(data);

        if(list1.head==null){
            list1.head=newnode;
        }
        else{
            Node last=list1.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=newnode;
        }
        return list1;
    }

    public static void printlist(Linkedlistdesign list1){
        Node curr=list1.head;

        System.out.println("Linkedlist::");
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        Linkedlistdesign list1=new Linkedlistdesign();

        list1=list1.insert(list1, 0);
        list1=list1.insert(list1, 2);

        printlist(list1);
    }
}
