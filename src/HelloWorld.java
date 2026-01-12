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

    public static void main(String[] args) {
        System.out.println(runIfElse(10));
    }
}
