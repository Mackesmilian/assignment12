/*
 * UE12
 * Baker.java
 * Baker class implements runnable and uses Thread.wait() to simulate baking
 * time.
 * Author: Maximilian Wolf
 * Last Change: 03.06.2020
 */

public class Baker implements Runnable {
    private Bread bread;

    public Baker() {}

    public Baker(Bread bread) {
        this.bread = bread;
        Thread t = new Thread(this, "Baker");
        t.start();
    }

    public void run() {
        int breadNr = 0;
        synchronized (bread){
            while (bread.getBreadId() < 5) {
                bread.bake(breadNr++);
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
