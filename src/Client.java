/*
 * TODO: add Header
 * */

public class Client implements Runnable {
    private Bread bread = null;

    public Client() {}

    public Client(Bread bread) {
        this.bread = bread;
        Thread t = new Thread(this, "Client");
        t.start();
    }

    //TODO: Modify the method
    public void run() {
        while (true) {
            bread.eat();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}