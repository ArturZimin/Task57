package by.minsk.itakademy.arturzimin;

public class ConsumerThread extends Thread {

    public void run(){
        int count=0;
        for(int i=0;i<10_000;i++){
            if (Main.queue.size()!=0){


            Main.queue.peek();
            count++;
        }
        }


    }
}
