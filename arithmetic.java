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
        int a=10,b=20;
        System.out.println(add(10,20));
        System.out.println(sub(10,20));
        System.out.println(mult(10,20));
        System.out.println(div(10,20));
    }
}