public class Main {

    public static void main(String[] args) {
        Triangle rigthAngled = new Triangle(3,4,3,4,5); //instance

        double Area1 = rigthAngled.findArea(); //instance method

        System.out.println("Area of first triangle is " + Area1);
    }
}
