package com.xebia.xke.ThreadSafety;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by kmalhotra on 03/06/16.
 */
public class SequenceFixed {
    private AtomicInteger value = new AtomicInteger(1);

    public int getNext() {
        return value.getAndIncrement();
    }
}













class ClientSeqFixed {

    public static void main(String[] args) {

        final SequenceFixed seqObj = new SequenceFixed();

        Runnable task = new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName() + ": Getting next sequence " + seqObj.getNext());

                    try {
                        Thread.sleep(200);
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
