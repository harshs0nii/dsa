public class LL {
    Node head;
    class Node{
    String data;
        Node next;

        public Node(String data) {
            this.data= data;
            this.next = null;
        }     
    }
    //add - first , last
    public void addfirst(String data){
        Node NewNode = new Node(data);
        if(head == null){
            head = NewNode;
            return;
        }
        NewNode.next = head;
        head = NewNode;
    }
    // last
    public void addlast(String data){
        Node NewNode = new Node(data);
        if(head==null){
            head = NewNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = NewNode;
    }
    public void printlist(){
        if(head ==null){
            System.out.println("head is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data +"-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addfirst("roman");
        list.addfirst("the");
        list.printlist();
        list.addlast("empire");
        list.printlist();
    }

}
