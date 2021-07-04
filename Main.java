package by.minsk.itakademy.arturzimin;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Main {

    public  static Queue <Integer>queue=new ArrayDeque<>(200);

    public static void main(String[] args) {
       /** Queue <Integer>queue=new ArrayDeque<>(200);
        Random random=new Random();
        for (int i=1;i<150;i++){
            queue.add(random.nextInt(50));
        }*/

        ProducerThread producerThread=new ProducerThread();
        producerThread.start();
        ProducerThread producerThread1=new ProducerThread();
        producerThread1.start();
        ProducerThread producerThread2=new ProducerThread();
        producerThread2.start();

        ConsumerThread consumerThread=new ConsumerThread();
        consumerThread.start();
        ConsumerThread consumerThread1=new ConsumerThread();
        consumerThread1.start();

    }
}
