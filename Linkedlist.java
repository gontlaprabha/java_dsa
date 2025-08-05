
// // public class Linkedlist{
// //     public static void main(String[] args) {
// //        LinkedList<Integer>list=new LinkedList<>();
// //        list.add(1);
// //        list.addFirst(0);
// //        list.add(2);
// //        list.add(3,3);
// //        int size=list.size();
// //        System.out.println(size);
// //        System.out.println(list);
// //        list.removeFirst();
// //        list.remove(1);
// //        list.remove();
// //        list.removeLast(1,2);


// //     }
// // }




public class Linkedlist {
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
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add last - O(1)
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print the list
    public void print() {
        if (head == null) {
            System.out.println("null");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("Null\n");
    }

    // Add at a specific index
    public void addMiddle(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Get size
    public void getSize() {
        System.out.println(size);
    }

    // Remove first element
    public int removeFirst() {
        if (size == 0) {
            System.out.println("No elements to remove");
            return Integer.MAX_VALUE;
        }
        int val = head.data;
        head = head.next;
        size--;
        if (size == 0) tail = null;
        return val;
    }

    // Remove last element
    public int removeLast() {
        if (size == 0) {
            System.out.println("No elements to delete");
            return Integer.MAX_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Reverse the linked list - O(n)
    public void reverse() {
        Node currNode = head;
        Node prevNode = null;
        Node next;

        tail = head; // Update tail before reversing
        while (currNode != null) {
            next = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = next;
        }
        head = prevNode;
    }

    // Delete the nth node (0-based index)
    public void deleteNth(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        size--;
        if (prev.next == null) {
            tail = prev;}
    }


    public void findmiddle(){
        Node slow=head;
        Node fast=head;

        while(fast != null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        System.out.println(slow.data);
    }

    public boolean islooped(){
        Node slow=head;
        Node fast=head;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false; 
    }

    public static void removeloop(){
        

    }

    public void removeduplicates(){
        Node node=head;

        while(node.next !=null){
           if(node == node.next){
            node.next=node.next.next;
            size--;
           }
           else{
               node=node.next;
           }
        }

    
    }
    

    
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(3);
        ll.removeduplicates();

        ll.print();
    


    }
}
