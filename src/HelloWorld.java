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

    public static double calculateCostOfMeal(double price, double tipRate, double taxRate) {
        double tip = tipRate * price;
        double tax = taxRate * price;
        return tip + tax + price;
    }


    public static double calculatePower(double number, double powerValue) {
        return Math.pow(number,powerValue);
    }
    public static void main(String[] args) {
        System.out.println(runIfElse(10));
        runNewFunction();
        runNewFunctionWithParameters("Tea Time");
        System.out.println("Your meal total price is " + calculateCostOfMeal(20, 0.1, 1.0));
        System.out.println(calculatePower(2,10));
    }
}
