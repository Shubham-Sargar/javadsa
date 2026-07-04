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

    // Insert at any position
    void insertAtPosition(int data, int position) {

        Nodes newNode = new Nodes(data);

        // Insert at first position
        if (position == 1) {
            newNode.address = head;
            head = newNode;
            return;
        }

        Nodes temp = head;

        // Move to the node before the required position
        for (int i = 1; i < position - 1; i++) {

            if (temp == null) {
                System.out.println("Invalid Position");
                return;
            }

            temp = temp.address;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.address = temp.address;
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
    // Delete node at any position
    void deleteAtPosition(int position) {

        // Check if the list is empty
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        // Check for invalid position
        if (position <= 0) {
            System.out.println("Invalid Position");
            return;
        }

        // Delete the first node
        if (position == 1) {
            head = head.address;
            return;
        }

        Nodes temp = head;

        // Move to the node before the one to delete
        for (int i = 1; i < position - 1; i++) {

            if (temp == null || temp.address == null) {
                System.out.println("Invalid Position");
                return;
            }

            temp = temp.address;
        }

        // If position is beyond the list length
        if (temp.address == null) {
            System.out.println("Invalid Position");
            return;
        }

        // Delete the node
        temp.address = temp.address.address;
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(20);
        ll.addFirst(10);

        ll.addLast(40);
        ll.addLast(50);

        System.out.println("Original List:");
        ll.display();

        ll.insertAtPosition(30, 3);

        System.out.println("After Insert at Position 3:");
        ll.display();

        ll.deleteFirst();

        System.out.println("After deleteFirst():");
        ll.display();

        ll.deleteLast();

        System.out.println("After deleteLast():");
        ll.display();
    }
}