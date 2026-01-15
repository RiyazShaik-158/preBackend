public class Main {

    public static void main(String[] args) {
        Triangle rigthAngled = new Triangle(3,4,3,4,5); //instance
        Triangle rigthAngledAnother = new Triangle(4,3,3,4,5);

        double Area1 = rigthAngled.findArea(); //instance method
        double Area2 = rigthAngledAnother.findArea();

        System.out.println("Area of first triangle is " + Area1);
        System.out.println("Area of second triangle is " + Area2);
    }
}
