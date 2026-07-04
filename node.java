class node {
    int data;
    node address;

    node(int data, node address){
        this.data= data;
        this.address= null;
    }

    public static void main(String[]args){
        /**
         *  linked list store the element in not continuous memory location.
         *
         *
         *  Data ->  Data|Address -> Data|Address ->Data|Address -> Null.
         *  NOde1 -> NOde2         -> NOde3        ->NOde4        -> NULL.
         *
         * Note :- node datatype of address Because it stores the next node address.
         *
         *  Creating linked List :-
         *
         * Class Node{
         *     int data;                   // creating the node.
         *     Node address;
         * }
         *
         *
         *
         *
         * */

        node node3 = new node(30, null);
        node node2 = new node(20, node3);
        node node1 = new node(10, node2);
        // Connect the nodes
        node1.address = node2;
        node2.address = node3;

        // Print the linked list
        node temp = node1;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.address;
        }

        System.out.println("null");
    }
}