/*
 * UE12
 * Bread.java
 * Bread class which contains the bake() and eat() method and handles the thread
 * operations, as in calling wait() and notifyAll().
 * Author: Maximilian Wolf
 * Last Change: 03.06.2020
 */
class Bread {
    private int breadId = -1;
    private static boolean continueCondition = false;

    public Bread() {
    }

    public Bread(int breadId) {
        this.breadId = breadId;
    }

    public int getBreadId() {
        return breadId;
    }

    public synchronized void bake(int breadId) {
        while (continueCondition) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("[READY TO CONSUME] Bread Nr:" + breadId);
        this.breadId = breadId;
        notifyAll();
        continueCondition = true;

    }
    
    public synchronized void eat() {
        while (!continueCondition) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("[ALREADY CONSUMED] Bread Nr:" + breadId);
        notifyAll();
        continueCondition = false;
    }
}