public class Main {

    public static void main(String[] args) {
        Triangle rigthAngled = new Triangle(3,4,3,4,5); //instance
        Triangle rigthAngledAnother = new Triangle(4,3,3,4,5);

        double Area1 = rigthAngled.findArea(); //instance method
        double Area2 = rigthAngledAnother.findArea();

        double baseOfTriangleA = rigthAngled.base; // instance variables - non-static because differs from each triangle
        double baseOfTriangleB = rigthAngledAnother.base;

        System.out.println("Area of first triangle is " + Area1);
        System.out.println("Area of second triangle is " + Area2);
        System.out.println(baseOfTriangleA);
        System.out.println(baseOfTriangleB);
        System.out.println(Triangle.numOfSides); //use whole class as reference for static variables, not the instance

    }
}
