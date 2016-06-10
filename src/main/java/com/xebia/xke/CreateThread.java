package com.xebia.xke;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by kmalhotra on 03/06/16.
 */
public class CreateThread {

    private void createNewThreadUsingThreadClass() {
        Thread worker = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ": Picking up " + i + " bricks");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        worker.setName("Ramu");
        worker.start();
    }

    private void createNewThreadUsingRunnable() {
        Collections.unmodifiableList(new ArrayList<Object>());
    }

    public static void main(String[] args) {
        new CreateThread().createNewThreadUsingThreadClass();
    }

}
