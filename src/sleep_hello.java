public class sleep_hello extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("hello");
            try{
                Thread.sleep(100);
            }catch(InterruptedException a){
                throw new RuntimeException(a);
            }
        }
    }
}
