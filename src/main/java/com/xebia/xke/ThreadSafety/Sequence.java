package com.xebia.xke.ThreadSafety;

/**
 * Created by kmalhotra on 03/06/16.
 */
public class Sequence {
    private int value = 1;

    public int getNext() {
        return value++;
    }
}













































class ClientSequence {

    public static void main(String[] args) {

        final Sequence seqObj = new Sequence();

        Runnable task = new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName() + ": Getting next sequence " + seqObj.getNext());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };


        Thread workerRamu = new Thread(task);
        workerRamu.setName("Ramu");

        Thread workerShamu = new Thread(task);
        workerShamu.setName("Shamu");


        workerShamu.start();
        workerRamu.start();
    }
}
