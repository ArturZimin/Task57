package by.minsk.itakademy.arturzimin;

import java.util.Random;

public class ProducerThread extends Thread {
    public synchronized void run() {

        Random random = new Random();
        for (int i = 0; i < 10_000; i++) {
            if (Main.queue.size() >= 80&&Main.queue.size()<=100) {

                Main.queue.add(random.nextInt(100));
            }else {

            }
        }


    }
}
