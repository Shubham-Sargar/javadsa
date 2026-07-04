public class Nodes {

    int data;
    Nodes address;

    // Constructor
    public Nodes(int data) {
        this.data = data;
        this.address = null;
    }

    // Constructor with address
    public Nodes(int data, Nodes address) {
        this.data = data;
        this.address = address;
    }
}