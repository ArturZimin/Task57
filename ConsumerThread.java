package by.minsk.itakademy.arturzimin;

public class ConsumerThread extends Thread {

    public synchronized void run(){
        int count=0;
        for(int i=0;i<10_000;i++){
           synchronized (this){if (Main.queue.size()!=0){

            Main.queue.peek();
        }else {
                try {
                    wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Consumer completed its work "+super.getName());

    }}
}
