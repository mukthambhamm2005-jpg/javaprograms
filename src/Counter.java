public class Counter {
    int count;

    synchronized void increment(){
        count++;
    }
}
