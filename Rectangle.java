public class Rectangle {
    // Private instance variables
    private int length;
    private int breadth;

    // Setter method for length
    public void setLength(int length) {
        this.length = length;
    }

    // Setter method for breadth
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an object of the Rectangle class
        Rectangle myRectangle = new Rectangle();

        // Using setter methods to initialize instance variables
        myRectangle.setLength(5);
        myRectangle.setBreadth(10);

        // Displaying the values of instance variables
        System.out.println("Length: " + myRectangle.length);
        System.out.println("Breadth: " + myRectangle.breadth);
    }
}
