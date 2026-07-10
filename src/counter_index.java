public class counter_index {
    public static void main(String[] args)throws InterruptedException{
        Counter c=new Counter();
        Thread t1=new Thread(()->{
            for(int i=1;i<=1000;i++){
                c.increment();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=1;i<=500;i++){
                c.increment();
            }
        });
        show_thread s=new show_thread();
        s.show();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
