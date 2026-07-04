public class LinkedList {

    Nodes head;

    // Add at the beginning
    void addFirst(int data) {

        Nodes newNode = new Nodes(data);

        newNode.address = head;
        head = newNode;
    }

    // Add at the end
    void addLast(int data) {

        Nodes newNode = new Nodes(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Nodes temp = head;

        while (temp.address != null) {
            temp = temp.address;
        }

        temp.address = newNode;
    }

    // Delete the first node
    void deleteFirst() {

        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        head = head.address;
    }

    // Delete the last node
    void deleteLast() {

        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        if (head.address == null) {
            head = null;
            return;
        }

        Nodes temp = head;

        while (temp.address.address != null) {
            temp = temp.address;
        }

        temp.address = null;
    }

    // Display the linked list
    void display() {

        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        Nodes temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.address;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(20);
        ll.addFirst(10);

        ll.addLast(30);
        ll.addLast(40);

        System.out.println("Original List:");
        ll.display();

        ll.deleteFirst();

        System.out.println("After deleteFirst():");
        ll.display();

        ll.deleteLast();

        System.out.println("After deleteLast():");
        ll.display();
    }
}