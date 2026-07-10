public class sleep_thread {
    public static void main(String[] args)throws InterruptedException{
        sleep_hi h1=new sleep_hi();
        sleep_hello h2=new sleep_hello();

        System.out.println("Priority  " +h1.isAlive());

        h1.start();
        h1.join();
        System.out.println("Priority  " +h2.isAlive());
        h2.start();
        System.out.println("Priority  " +h1.isAlive());
    }
}

