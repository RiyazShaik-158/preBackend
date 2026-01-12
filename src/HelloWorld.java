public class HelloWorld {

    public static String runIfElse(int s) {
        if(s >= 6) {
            return s + " is greater value";
        } else if (s <=4){
            return s + " is smaller value";
        } else {
            return s + " is the required value";
        }
    }

    public static void runNewFunction() {
        System.out.println("New function is executed");
    }

    public static void runNewFunctionWithParameters(String s) {
        System.out.println(s + " is the given string param");
    }

    public static void calculateCostOfMeal(double price, double tipRate, double taxRate) {
        double tip = tipRate * price;
        double tax = taxRate * price;
        double totalPrice = tip + tax + price;
        System.out.println("Your total meal pirce is " + totalPrice);
    }


    public static void main(String[] args) {
        System.out.println(runIfElse(10));
        runNewFunction();
        runNewFunctionWithParameters("Tea Time");
        calculateCostOfMeal(20, 0.1, 0.8);
    }
}
