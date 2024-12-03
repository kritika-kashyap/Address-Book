public class LinkedList <T>{
    // Node<T>[] a1 =(Node<T>[])new Object(10);
    Node<T> head = null;
    Node<T> current = null;

    public void add(T a) {
        Node<T> a1 = new Node<>(a);

        if(head == null) {
            head = a1;
        }
        else {
            current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = a1;
        }
    }

    public void display() {
        if(head == null) {
            System.out.println("Linked list is empty");
        }
        else {
            current = head;
            
            while(current.next != null) {
                System.out.println(current);
                current = current.next;
            }

            System.out.println(current);
        }
    }
}
