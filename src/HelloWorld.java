public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
    }

    enum shape {CIRCLE, SQUARE, TRIANGLE, STAR}

    public boolean fitsSquareHole(shape givenShape) { 
        return givenShape==shape.SQUARE;
    }

    public boolean fitsCircleHole(shape givenShape) { 
        return givenShape==shape.CIRCLE;
    }
}
