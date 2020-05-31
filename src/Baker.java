/*
 * TODO: add Header
 * */

public class Baker implements Runnable {
    private Bread bread;

    public Baker() {}

    public Baker(Bread bread) {
        this.bread = bread;
        Thread t = new Thread(this, "Baker");
        t.start();
    }

    //TODO: Modify the method
    public void run() {
        int breadNr = 0;
        while (true) {
            bread.bake(breadNr++);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
