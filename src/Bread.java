/*
 * TODO: add Header
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

    //TODO: Modify the method
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

    //TODO: Modify the method
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