public class array_out_of_bound_exception {
    public static void main(String[] args){
        System.out.println("hellooo");
        int arr[]={1,2,3,4,5};
        int a=5;
        int b=0;
        int res;
        try{
            System.out.println(arr[4]);

        }catch(ArrayIndexOutOfBoundsException m){
            System.out.println("stay in your limits  "+m);
        }
        try {
            res = a / b;
            System.out.println(res);
        }catch(ArithmeticException e) {
            System.out.println("divide by zero error " + e);
        }
        System.out.println("byeee");}
}
