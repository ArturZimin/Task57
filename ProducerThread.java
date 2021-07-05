package by.minsk.itakademy.arturzimin;

import java.util.Random;

public class ProducerThread extends Thread {
    public synchronized void run() {
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < 10_000; i++) {
            synchronized (this) {
                if (Main.queue.size() >= 80 && Main.queue.size() <= 100) {

                    Main.queue.add(random.nextInt(100));
                    count=i;
                } else {
                    try {
                        wait(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }

            System.out.println("Producer completed its work "+ super.getName());
        }
    }
}
