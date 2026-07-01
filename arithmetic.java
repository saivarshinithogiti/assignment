public class arithmetic {
    public static int add(int a,int b) {
        return a+b;
    }
    public static int sub(int a,int b) {
        return a-b;
    }
    public static int mult(int a,int b) {
        return a*b;
    }
    public static double div(double a,double b) {
        return a/b;
    }
    public static void main(String[] args) {
        int addition=add(10,20);
        int subtraction=sub(10, 20);
        int multiplication=mult(10, 20);
        double division=div(10, 20);

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
}