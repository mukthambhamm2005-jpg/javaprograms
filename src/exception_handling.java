public class exception_handling {
    public static void main(String[] args) {
        System.out.println("hellooo");
        int a = 5;
        int b = 0;
        int res;

        try {
            res = a / b;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("divide by zero error " + e);
        }finally{
            System.out.println("I'll run anyways ");
        }
        System.out.println("byeee");
    }
}
