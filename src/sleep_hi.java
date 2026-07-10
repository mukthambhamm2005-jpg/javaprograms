public class sleep_hi extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("hiiii");
            try{
                Thread.sleep(50);
            }catch(InterruptedException a){
                throw new RuntimeException(a);
            }
        }
    }

}
