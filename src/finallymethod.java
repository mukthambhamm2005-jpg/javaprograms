public class finallymethod {
    public static void main(String[]args){
        System.out.println("hellooo");
        int a = 5;
        int b = 0;
        int res;

        try {
            res = a / b;
            System.out.println(res);
        }finally{
            System.out.println("run anyways");
        }
        System.out.println("byeeeee");
    }
}
