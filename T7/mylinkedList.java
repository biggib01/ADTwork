package ADT.T7;

public class mylinkedList {
    node head;

    public mylinkedList insert(mylinkedList list, int data) { 
        node newNode = new node(data); 
        newNode.next = null; 
   
        if (list.head == null) { 
            list.head = newNode; 
        } 
        else {
            node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
            last.next = newNode; 
        } 
        return list; 
    } 

    public static void traversal(mylinkedList list,int index)
    {
        node curr = list.head;
 
        System.out.print("LinkedList: ");
        for(int i = 0 ; i < index ; i++){
            curr = curr.next;
        }
        
        while (curr != null) {

            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void printList(mylinkedList list)
    {
        node curr = list.head;
 
        System.out.print("LinkedList: ");
 
        while (curr != null) {
            System.out.print(curr.data + " ");
 
            curr = curr.next;
        }
        System.out.println();
    }

    public mylinkedList deleteAll(mylinkedList list){
        list.head = null;
        return list;
    }

    public static void main(String[] args) {
        mylinkedList list = new mylinkedList();

        list.insert(list, 2);
        list.insert(list, 10);
        list.insert(list, 10);
        list.insert(list, 10);
        list.insert(list, 10);

        traversal(list, 0);

        list.deleteAll(list);

        printList(list);
        
        

    }
}
