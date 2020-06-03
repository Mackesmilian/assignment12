/*
 * UE12
 * Client.java
 * Client class implements runnable and uses Thread.wait() to simulate eating
 * time for a piece of bread.
 * Author: Maximilian Wolf
 * Last Change: 03.06.2020
 */
public class Client implements Runnable {
    private Bread bread = null;

    public Client() {}

    public Client(Bread bread) {
        this.bread = bread;
        Thread t = new Thread(this, "Client");
        t.start();
    }

    public void run() {

        synchronized (bread){
            while (bread.getBreadId() < 5) {
                bread.eat();
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}